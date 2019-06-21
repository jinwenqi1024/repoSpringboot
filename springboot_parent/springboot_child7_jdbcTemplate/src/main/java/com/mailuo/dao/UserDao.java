package com.mailuo.dao;

import com.mailuo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(User user){
        String sql="insert into user (username,password) values (?,?)";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword());
    }

}
