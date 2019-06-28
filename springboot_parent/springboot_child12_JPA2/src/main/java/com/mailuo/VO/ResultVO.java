package com.mailuo.VO;

import lombok.Data;

import java.io.Serializable;
@Data
public class ResultVO<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;
}
