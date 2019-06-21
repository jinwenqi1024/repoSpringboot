package com.mailuo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * springboot整合quartz
 * 需要开启@EnableScheduling注解
 * 任务类方法上需要配置@Scheduled(fixedRate = 1000)注解
 */
@SpringBootApplication(scanBasePackages = {"com.mailuo.job"})
@EnableScheduling
public class SpringApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class,args);
    }
}
