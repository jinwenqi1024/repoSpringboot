package com.mailuo.controller;

import com.mailuo.pojo.User;
import com.mailuo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/show/{page}/{size}") //restful 风格
    @ResponseBody
    public List<User> query(@PathVariable int page, @PathVariable int size) {
        List<User> userList = userService.query(page, size);
        return userList;
    }

    @RequestMapping("/findbyname")
    @ResponseBody
    public User findByName(String username){
        return userService.findByName(username);
    }
}
