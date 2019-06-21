package com.mailuo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestExceptionController {
    @RequestMapping("/show")
    public String show(){
        int a=8/0;
        return "show";
    }
}
