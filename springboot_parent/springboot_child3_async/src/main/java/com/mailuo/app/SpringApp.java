package com.mailuo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * springboot实现异步执行、异步调用
 * 需要在启动类开启异步执行@EnableAsync
 */
@SpringBootApplication(scanBasePackages = {"com.mailuo.controller","com.mailuo.service"})
@EnableAsync
public class SpringApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class,args);
    }
}
