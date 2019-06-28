package com.mailuo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.mailuo.controller"})

public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class,args);
    }
}
