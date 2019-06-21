package com.mailuo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * springboot全局异常处理器
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> ExceptionHandler(Exception exception){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("error_code",500);
        map.put("error_msg",exception.toString());
        return map;
    }
}
