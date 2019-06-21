package com.mailuo.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot整合junit
 * //需要测试的目标类，即测试谁
 @SpringBootTest(classes = SpringController.class)
 //测试的驱动，即谁来测试
 @RunWith(SpringJUnit4ClassRunner.class)
 //springboot整合web
 @WebAppConfiguration

 */
/*@EnableAutoConfiguration
@ComponentScan("com.mailuo.controller")*/
// springbootapplication相当于@EnableAutoConfiguration+@ComponentScan("com.mailuo.controller")
@SpringBootApplication(scanBasePackages ={"com.mailuo.controller","com.mailuo.interceptor"} )
public class ApplicationController {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationController.class,args);
    }
}
