package com.mailuo.controller;

import com.mailuo.domain.User;
import com.mailuo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/saveUser")
    @ResponseBody
    public String saveUser(){
        User user=new User();
        user.setUsername("西门吹雪");
        user.setPassword("555555");
        userService.save(user);
        return "success";
    }
}
