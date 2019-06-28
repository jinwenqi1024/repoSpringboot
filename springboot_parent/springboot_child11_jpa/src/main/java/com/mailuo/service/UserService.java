package com.mailuo.service;

import com.mailuo.entity.User;
import com.mailuo.repostory.UserRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface{

    @Autowired
    private UserRepostory userRepostory;


    public List<User> getList() {
        return  userRepostory.findAllByUsername("zhangsan");
    }
}
