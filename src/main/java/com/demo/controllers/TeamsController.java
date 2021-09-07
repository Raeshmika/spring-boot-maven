package com.demo.controllers;

import com.demo.domain.TeamDeveloper;
import com.demo.mapper.TeamDeveloperMapper;
import com.demo.services.TeamDeveloperService;
import com.demo.services.TeamService;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/alerts")
public class TeamsController {

    private static Logger logger = LogManager.getLogger(TeamsController.class);

    @Autowired
    private TeamDeveloperService teamDeveloperService;

    @Autowired
    private TeamDeveloperMapper teamDeveloperMapper;


    @PostMapping("/teams")
    public ResponseEntity createTeams(@RequestBody TeamDeveloper teamDeveloper) {
        teamDeveloperService.saveTeamDeveloper(teamDeveloper);
        return ResponseEntity.ok().body(teamDeveloper);
    }
}
