package com.mailuo.controller;

import com.mailuo.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
public class AsyncController {
    @Autowired
    private AsyncService asyncService;
    @RequestMapping("/async")
    public String testAsync() throws Exception {
        long start=System.currentTimeMillis();
        Future<String> task1 = asyncService.doTask1();
        Future<String> task2 = asyncService.doTask2();
        Future<String> task3 = asyncService.doTask3();
        while (true){
            if(task1.isDone() && task2.isDone() && task3.isDone()){
                break;
            }
            Thread.sleep(1000);
        }
        long end=System.currentTimeMillis();
        return "总耗时："+(end-start)+"毫秒";
    }
}
