package com.mailuo.service;

import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.Future;

@Service
public class AsyncServiceImpl implements AsyncService {
    private Random random=new Random();
    public Future<String> doTask1() throws Exception {
        System.out.println("任务一开始执行");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("任务一总耗时："+(end-start)+"毫秒");
        return new AsyncResult<String>("任务一结束");
    }

    public Future<String> doTask2() throws Exception {
        System.out.println("任务二开始执行");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("任务二总耗时："+(end-start)+"毫秒");
        return new AsyncResult<String>("任务二结束");
    }

    public Future<String> doTask3() throws Exception {
        System.out.println("任务三开始执行");
        long start=System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end=System.currentTimeMillis();
        System.out.println("任务三总耗时："+(end-start)+"毫秒");
        return new AsyncResult<String>("任务三结束");
    }
}
