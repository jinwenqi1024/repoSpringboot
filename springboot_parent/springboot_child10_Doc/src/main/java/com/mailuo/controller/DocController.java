package com.mailuo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("api/user")
public class DocController {

    /**
     * 登录
     *
     * @param username 用户名|必填
     * @param password 密码
     * @return 当前登录用户的基本信息
     * @resp code 返回码(0000表示登录成功,其它表示失败)|string|必填
     * @resp msg 登录信息|string
     * @resp username 登录成功后返回的用户名|string
     */
    @ResponseBody
    @PostMapping("login")
    public Map<String, String> login(String username, String password) {
        Map<String, String> model = new HashMap<>();
        model.put("code", "0000");
        model.put("msg", "登录成功");
        model.put("username", username);
        return model;
    }
    @ResponseBody
    @RequestMapping("/register")
    public String get1(){
        return "hello";
    }
    @ResponseBody
    @RequestMapping("/")
    public String get2(){
        return "helloworld";
    }



}
