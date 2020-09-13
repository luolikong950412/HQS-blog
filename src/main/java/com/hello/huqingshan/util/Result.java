package com.hello.huqingshan.util;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Result<T> {
    private T data;
    private String message;
    private int code;
    private String token;
}
