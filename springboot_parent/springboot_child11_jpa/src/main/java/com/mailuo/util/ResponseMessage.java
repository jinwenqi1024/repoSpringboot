package com.mailuo.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Data和@AllArgsConstructor和@NoArgsConstructor都是Lombok插件的注解，
 * 代表自动为实体生成get，set方法，重写toString()方法，自动生成全参，无参构造函数
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage {
    //返回状态码
    private int code;

    //返回提示信息
    private String msg;

    //返回数据
    private Object data;

    public static ResponseMessage success(Object data) {
        return new ResponseMessage(1,"success",data);
    }
    public static ResponseMessage success() {
        return new ResponseMessage(1,"success",null);
    }
    public static ResponseMessage error() {
        return new ResponseMessage(0,"error",null);
    }



}
