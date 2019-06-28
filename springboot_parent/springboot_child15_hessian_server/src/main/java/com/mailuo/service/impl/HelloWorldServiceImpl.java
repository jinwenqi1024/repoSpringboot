package com.mailuo.service.impl;

import com.mailuo.service.HelloWorldService;
import org.springframework.stereotype.Service;

/**
 * @Author jinwenqi
 * @Date 15:25 2019/6/26
 * @Project SpringBoot
 * @Description
 **/
@Service("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {
    public String sayHello(String name) {
        return "服务端返回：hello hessian"+name;
    }
}
