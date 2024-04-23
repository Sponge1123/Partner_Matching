package com.buka.partnermatchingbackend.mapper;

import com.buka.partnermatchingbackend.model.domain.UserTeam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author SPONGE
* @description 针对表【user_team(用户队伍关系)】的数据库操作Mapper
* @createDate 2024-04-20 22:33:09
* @Entity com.buka.partnermatchingbackend.model.domain.UserTeam
*/
@Mapper
public interface UserTeamMapper extends BaseMapper<UserTeam> {

}




