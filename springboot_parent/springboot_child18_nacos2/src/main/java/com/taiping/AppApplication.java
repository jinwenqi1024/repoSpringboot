package com.taiping;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author jinwenqi
 * @Date 10:23 2019/6/28
 * @Project SpringBoot
 * @Description
 **/
@SpringBootApplication
@EnableDiscoveryClient
@NacosPropertySource(dataId = "datasource.properties", autoRefreshed = true)
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class,args);
    }
}
