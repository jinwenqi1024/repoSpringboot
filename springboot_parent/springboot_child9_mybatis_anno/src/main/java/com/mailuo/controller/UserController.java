package com.mailuo.controller;

import com.mailuo.pojo.User;
import com.mailuo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/find")
    public List<User> queryUser(){

        return userService.queryUser();
    }

    @RequestMapping("/add")
    public String addUser(){
        User user=new User();
        user.setUsername("李二哈哈");
        user.setPassword("66666666");
        userService.addUser(user);
        return "ok";
    }
}
