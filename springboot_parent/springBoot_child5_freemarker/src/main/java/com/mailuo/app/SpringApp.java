package com.mailuo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot整合模板引擎freemarker，thymeleaf跟freemarker一样 取值 th:text="${name}"
 * springboot默认寻找resources下的templates，默认在此目录生成静态页面
 * 如果需要自定义，则要在全局配置文件里进行配置
 *
 */
@SpringBootApplication(scanBasePackages = {"com.mailuo.controller"})
public class SpringApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class,args);
    }
}
