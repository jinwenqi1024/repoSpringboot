package com.mailuo.controller;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.mailuo.domain.Person;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.Date;


//responseBody返回restful内容
@RestController
public class SpringController {

    //springboot默认了消息转换器UTF-8，所以下面这个也可以不用配置
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
        StringHttpMessageConverter converter=new StringHttpMessageConverter(Charset.forName("UTF-8"));

        return converter;
    }


    //fastjason
    @Bean
    public HttpMessageConverters fastjasonMessageConverter(){
        //创建fastjason消息转换器
        FastJsonHttpMessageConverter converter=new FastJsonHttpMessageConverter();
        //创建fastjason的配置对象
        FastJsonConfig config=new FastJsonConfig();
        //对json数据进行格式化
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
        converter.setFastJsonConfig(config);
        HttpMessageConverter<?> con=converter;
        return new HttpMessageConverters(con);
    }

    @RequestMapping("/")
    public  String first(){
        return "hello，金";
    }

    /**
     * springboot支持rest风格
     * @param msg
     * @return
     */
    //表示将接收到的参数付给msg
    @RequestMapping("/info/{msg}")
    public String two(@PathVariable String msg){
        return "helloworld"+msg;
    }

    //springboot利用fastjason将对象转换为jason到前台
    @ResponseBody
    @RequestMapping("/person")
    public Object three(){
        Person person=new Person();
        person.setId(111);
        person.setName("张三");
        person.setDate(new Date());
        return person;
    }



}
