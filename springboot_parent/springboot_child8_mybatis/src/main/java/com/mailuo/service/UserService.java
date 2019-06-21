package com.mailuo.service;

import com.mailuo.pojo.User;

import java.util.List;

public interface UserService {

    List<User> query(int pageNUm,int pageSize);

    User findByName(String username);
}
