package com.taiping;

/**
 * @Author jinwenqi
 * @Date 13:43 2019/6/28
 * @Project SpringBoot
 * @Description
 **/

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@NacosPropertySource(dataId = "springboot2-nacos-config", autoRefreshed = true)
@Controller
public class Springboot2NacosConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2NacosConfigApplication.class, args);
    }

    @NacosValue(value = "${nacos.test.propertie:123}", autoRefreshed = true)
    private String testProperties;

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return testProperties;
    }

}

