package com.buka.partnermatchingbackend.job;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.buka.partnermatchingbackend.model.domain.User;
import com.buka.partnermatchingbackend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 预热缓存任务,Redisson实现分布式锁
 * 定时任务+锁
 * 续锁机制,Watch God 看门狗机制
 */
@Component
@Slf4j
public class PreCacheJob {
    @Autowired
    public RedisTemplate<String,Object> redisTemplate;
    @Autowired
    private UserService userService;
    @Autowired
    private RedissonClient redissonClient;
    //将重点用户记录下来
    private final List<Long> mainUserList = Arrays.asList(520L);
    //每天执行，预热推荐用户
    @Scheduled(cron = "0 3 0 * * *") //秒分时日月年
    public void doCacheRecommendUser(){
        RLock lock = redissonClient.getLock("sponge:precachejob:lock");
        try {
            //只有一个线程能够获取到锁
            //等待时间；锁的过期时间
            if (lock.tryLock(0,-1,TimeUnit.MILLISECONDS)) {
                for (Long userId : mainUserList) {
                    //没有缓存，查询数据库(Studying)
                    QueryWrapper<User> queryWrapper = new QueryWrapper<>();
                    Page<User> userPage = userService.page(new Page<>(1, 20), queryWrapper);
                    String redisKey = String.format("sponge:user:recommend:%s", userId);
                    ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
                    //写缓存
                    try {
                        valueOperations.set(redisKey, userPage, 30000, TimeUnit.MILLISECONDS);
                    } catch (Exception e) {
                        log.error("redis set key error", e);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //无论如何都要把锁释放,先判断是否是自己的锁
            if (lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
