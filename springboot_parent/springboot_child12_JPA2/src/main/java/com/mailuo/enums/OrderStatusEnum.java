package com.mailuo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStatusEnum implements CodeEnum {

    NEW(0,"新订单"),
    FINISH(1,"完结订单"),
    CANCEL(2,"取消")

    ;
    private Integer code;
    private String message;


}
