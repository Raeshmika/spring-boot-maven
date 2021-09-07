package com.demo.mapper;

import com.demo.domain.Developer;
import com.demo.domain.Team;
import com.demo.domain.TeamDeveloper;

import java.util.ArrayList;
import java.util.List;


public class TeamDeveloperMapper {

    public Team setTeamObject(TeamDeveloper teamObject) {

        Team team = new Team();
        team.setName(teamObject.getTeam().getName());
        return team;
    }

    public List<Developer> setDevelopersObject(TeamDeveloper teamDeveloper, Integer teamId) {
        List<Developer> developers = new ArrayList<>();
        List<Developer> developersWithID = new ArrayList<>();

        for (Developer d : developers) {
            Developer developer = new Developer();
            developer.setName(d.getName());
            developer.setTeamId(teamId);
            developer.setPhoneNumber(d.getPhoneNumber());
            developer.setName(d.getName());
            developersWithID.add(developer);

        }
        return developersWithID;
    }

}
