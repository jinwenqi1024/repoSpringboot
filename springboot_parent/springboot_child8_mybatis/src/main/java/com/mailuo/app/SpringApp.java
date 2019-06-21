package com.mailuo.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * springboot整合mybatis
 * pagehelper分页插件的使用
 * 注意：1.<select id="queryUser" resultType="com.mailuo.pojo.User"  >
 *     这个id要去UserMapper里的方法名一致!!!!
 *     2.要加这个扫描@MapperScan("com.mailuo.mapper")
 *开启缓存：@EnableCaching
 * 在查询方法上添加 @Cacheable(value = "myname")
 *
 */
@SpringBootApplication(scanBasePackages = {"com.mailuo"})
@MapperScan("com.mailuo.mapper")
@EnableCaching
public class SpringApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class,args);
    }
}
