package com.mailuo.service;

import com.mailuo.pojo.User;

import java.util.List;

public interface UserService {

    List<User> queryUser();

    void addUser(User user);
}
