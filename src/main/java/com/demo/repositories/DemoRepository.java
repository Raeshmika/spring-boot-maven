package com.demo.repositories;

import com.demo.domain.DummyUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class DemoRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    private static final Logger logger = LogManager.getLogger(DemoRepository.class);

    private static String INSERT_TO_DUMMY_USER = "INSERT INTO  dummy_user(first_name, last_name, email, password) values (?, ?, ?, ?) ";


    public DummyUser saveDummyUser(DummyUser user) {

        Connection con = null;
        boolean success = false;
        int val = 0;
        try {
            con = dataSource.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement(INSERT_TO_DUMMY_USER, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,user.getFirstName());
            preparedStatement.setString(2,user.getLastName());
            preparedStatement.setString(3,user.getEmail());
            preparedStatement.setString(4,user.getPassword());
            val = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            logger.error("Error inserting.. "+ e.getMessage());
        }
        return user;
    }


}
