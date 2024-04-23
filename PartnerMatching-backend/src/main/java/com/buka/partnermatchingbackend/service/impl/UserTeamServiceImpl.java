package com.buka.partnermatchingbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buka.partnermatchingbackend.model.domain.UserTeam;
import com.buka.partnermatchingbackend.service.UserTeamService;
import com.buka.partnermatchingbackend.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
* @author SPONGE
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2024-04-20 22:33:09
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService{

}




