package com.demo.domain;

import org.springframework.stereotype.Component;

@Component
public class Team {

    private Integer teamId;

    private String name;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
