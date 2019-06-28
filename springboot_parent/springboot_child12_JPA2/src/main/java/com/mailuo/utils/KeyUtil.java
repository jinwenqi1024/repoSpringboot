package com.mailuo.utils;

import java.util.Random;

/**
 * @Author jinwenqi
 * @Date 13:15 2019/6/26
 * @Project SpringBoot
 * @Description
 **/
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random=new Random();
        int number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }
}
