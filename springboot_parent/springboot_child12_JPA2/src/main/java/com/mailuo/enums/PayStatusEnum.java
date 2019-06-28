package com.mailuo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PayStatusEnum implements CodeEnum {

    WAIT(0,"未支付"),
    SUCCESS(1,"支付成功")


    ;


    private Integer code;
    private String message;



    public Integer getCode() {
        return null;
    }
}
