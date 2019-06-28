package com.mailuo.config;

import com.mailuo.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

import javax.annotation.Resource;

/**
 * @Author jinwenqi
 * @Date 16:16 2019/6/26
 * @Project SpringBoot
 * @Description
 **/
@Configuration
public class HessionServiceConfig {


    @Resource
    private HelloWorldService helloWorldService;


    /**
     * 1. HessianServiceExporter是由Spring.web框架提供的Hessian工具类，能够将bean转化为Hessian服务
     * 2. @Bean(name = "/helloHessian.do")加斜杠方式会被spring暴露服务路径,发布服务。
     * @return
     */
    @Bean(name = "/helloHessian.do")
    public HessianServiceExporter accountService(){
        HessianServiceExporter exporter=new HessianServiceExporter();
        exporter.setService(helloWorldService);
        exporter.setServiceInterface(HelloWorldService.class);
        return exporter;
    }
}
