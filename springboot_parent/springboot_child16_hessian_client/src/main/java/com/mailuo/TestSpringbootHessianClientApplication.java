package com.mailuo;

import com.mailuo.service.HelloWorldService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

/**
 * @Author jinwenqi
 * @Date 15:53 2019/6/26
 * @Project SpringBoot
 * @Description
 **/
@SpringBootApplication
public class TestSpringbootHessianClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestSpringbootHessianClientApplication.class, args);


    }

    @Bean
    public HessianProxyFactoryBean helloClient(){
        HessianProxyFactoryBean factoryBean = new HessianProxyFactoryBean();
        factoryBean.setServiceUrl("http://localhost:8081/helloHessian.do");
        factoryBean.setServiceInterface(HelloWorldService.class);
        return factoryBean;
    }





}
