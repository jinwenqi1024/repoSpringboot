package com.mailuo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {
    @RequestMapping("/show")
    public ModelAndView show(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username","刘亦菲");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/")
    public String first(){
        return "hello";
    }
}
