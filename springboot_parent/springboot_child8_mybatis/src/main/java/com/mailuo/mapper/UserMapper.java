package com.mailuo.mapper;

import com.mailuo.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> queryUser();

    User findByName(String username);
}
