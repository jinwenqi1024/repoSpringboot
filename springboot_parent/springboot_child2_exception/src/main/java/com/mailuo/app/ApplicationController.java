package com.mailuo.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@EnableAutoConfiguration
@ComponentScan("com.mailuo.controller")*/
// springbootapplication相当于@EnableAutoConfiguration+@ComponentScan("com.mailuo.controller")
@SpringBootApplication(scanBasePackages ={"com.mailuo.controller"} )
public class ApplicationController {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationController.class,args);
    }
}
