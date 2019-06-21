package com.mailuo.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
//任务：每隔一秒打印一次当前系统时间
@Component
public class Myjob {
    @Scheduled(fixedRate = 1000)
    public void doTast(){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
