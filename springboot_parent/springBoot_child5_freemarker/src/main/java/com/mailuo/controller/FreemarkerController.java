package com.mailuo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FreemarkerController {
    @RequestMapping("/freemarker")
    public ModelAndView show(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name","张三丰");
        mv.setViewName("index");
        return mv;

    }
}
