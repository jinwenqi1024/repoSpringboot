package com.mailuo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//开启自动配置，exclude表示排除redis的自动配置
@EnableAutoConfiguration(exclude = {RedisAutoConfiguration.class})
public class MyController {

    @RequestMapping("/")
    @ResponseBody
    public String first(){
        return "helloworld";
    }

    //入口
    public static void main(String[] args) {
        SpringApplication.run(MyController.class,args);
    }
}
