package com.mailuo.service;

import com.mailuo.dao.UserDao;
import com.mailuo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void save(User user){
        userDao.save(user);
    }
}
