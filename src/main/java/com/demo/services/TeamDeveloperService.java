package com.demo.services;

import com.demo.domain.Developer;
import com.demo.domain.Team;
import com.demo.domain.TeamDeveloper;
import com.demo.mapper.TeamDeveloperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TeamDeveloperService {

    @Autowired
    private TeamDeveloperMapper teamDeveloperMapper;
    @Autowired
    TeamService teamService;
    @Autowired
    DeveloperService developerService;


    @Transactional
    public TeamDeveloper  saveTeamDeveloper(TeamDeveloper teamDeveloper) {
        Team team = teamDeveloperMapper.setTeamObject(teamDeveloper);
        teamService.saveTeam(team);
        List<Developer> developerList = teamDeveloperMapper.setDevelopersObject(teamDeveloper, team.getTeamId());
        developerService.saveDevelopersWithTeams(developerList);
        return teamDeveloper;
    }
}
