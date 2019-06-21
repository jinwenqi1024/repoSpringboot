package com.mailuo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * springboot整合jsp
 * jsp需要的是一个web工程，原来需要web.xml以及配置视图解析器，
 * 全局配置文件配置
 * 打包要点：war/provided/extends springbootservletinitializer/重写configure
 */
@SpringBootApplication(scanBasePackages = {"com.mailuo.controller"})
public class SpringApp extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringApp.class);
    }
}
