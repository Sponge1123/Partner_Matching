package com.buka.partnermatchingbackend.mapper;

import com.buka.partnermatchingbackend.model.domain.Team;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author SPONGE
* @description 针对表【team(队伍)】的数据库操作Mapper
* @createDate 2024-04-20 22:32:10
* @Entity com.buka.partnermatchingbackend.model.domain.Team
*/
@Mapper
public interface TeamMapper extends BaseMapper<Team> {

}




