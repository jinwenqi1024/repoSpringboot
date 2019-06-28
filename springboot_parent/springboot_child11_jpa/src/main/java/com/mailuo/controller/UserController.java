package com.mailuo.controller;

import com.mailuo.service.UserServiceInterface;
import com.mailuo.util.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceInterface userServiceInterface;

    @RequestMapping("/find")
    public ResponseMessage getUser(){
        return ResponseMessage.success(userServiceInterface.getList());
    }
}