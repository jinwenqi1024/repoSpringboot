package com.mailuo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一种：通过value获取自定义的值，为成员变量赋值
 * 第二种：不用value,加configuratuionproperties(prefix="book"),同时生产get/set方法
 *       即可完成全部赋值,采用此种方式要注意命名规范
 *
 */
@RestController
@EnableAutoConfiguration
@ConfigurationProperties(prefix = "book")
public class MyController {
    //@Value("${book.author}")
    private String author;

   //@Value("${book.name}")
    private String name;

    private String price;

    private String date;


    @RequestMapping("/")
    public String first(){
        return name+":"+author+":"+price+":"+date;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyController.class,args);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
