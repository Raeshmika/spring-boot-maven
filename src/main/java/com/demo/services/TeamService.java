package com.demo.services;

import com.demo.domain.Team;
import com.demo.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

     public Team saveTeam(Team team) {
         teamRepository.saveTeam(team);
         return team;
     }



}
