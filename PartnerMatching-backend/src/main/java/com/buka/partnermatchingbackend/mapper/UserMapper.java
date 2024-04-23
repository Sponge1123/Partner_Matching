package com.buka.partnermatchingbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buka.partnermatchingbackend.model.domain.User;
import org.apache.ibatis.annotations.Mapper;

;

/**
 * 用户 Mapper
 *
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}



