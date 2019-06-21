package com.mailuo.service;

import com.mailuo.mapper.UserMapper;
import com.mailuo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> queryUser() {
        List<User> users = userMapper.queryUser();
        return users;
    }

    public void addUser(User user) {
        userMapper.addUser(user.getUsername(),user.getPassword());
    }
}
