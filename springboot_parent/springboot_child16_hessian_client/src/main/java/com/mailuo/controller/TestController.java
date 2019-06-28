package com.mailuo.controller;

import com.mailuo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jinwenqi
 * @Date 18:20 2019/6/26
 * @Project SpringBoot
 * @Description
 **/
@RestController
public class TestController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/test")
    public String first(){
        return helloWorldService.sayHello("");
    }
}
