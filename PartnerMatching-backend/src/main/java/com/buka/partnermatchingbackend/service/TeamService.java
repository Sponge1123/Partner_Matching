package com.buka.partnermatchingbackend.service;

import com.buka.partnermatchingbackend.dto.TeamQuery;
import com.buka.partnermatchingbackend.dto.TeamQuitRequest;
import com.buka.partnermatchingbackend.dto.TeamUpdateRequest;
import com.buka.partnermatchingbackend.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.buka.partnermatchingbackend.model.domain.User;
import com.buka.partnermatchingbackend.model.domain.request.TeamJoinRequest;
import com.buka.partnermatchingbackend.model.domain.vo.TeamUserVO;

import java.util.List;

/**
* @author SPONGE
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2024-04-20 22:32:10
*/
public interface TeamService extends IService<Team> {
    /**
     * 创建队伍
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

    /**
     * 搜索队伍
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍
     * @param teamUpdateRequest
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest,User loginUser);

    /**
     * 加入队伍
     * @param teamJoinRequest
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest,User loginUser);

    /**
     * 退出队伍
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 队长解散队伍
     * @param id
     * @return
     */
    boolean deleteTeam(long id,User loginUser);
}
