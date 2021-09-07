package com.demo.repositories;

import com.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;

@Repository
public class TeamRepository {

    @Autowired
    private DataSource dataSource;

    public int saveTeam(Team team) {
        Connection connection = dataSource.getConnection();

    }
}
