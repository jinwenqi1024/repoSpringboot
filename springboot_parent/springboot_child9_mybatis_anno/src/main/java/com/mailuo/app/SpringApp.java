package com.mailuo.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot整合mybatis
 *注解版本
 */
@SpringBootApplication(scanBasePackages = {"com.mailuo"})
@MapperScan("com.mailuo.mapper")
public class SpringApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class,args);
    }
}
