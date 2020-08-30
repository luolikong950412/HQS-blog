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

    //这里不需要写泛型
    //傻逼，上面数据是private，你不用pbulic的get方法怎么获得数据
    public Result(T data,String message,int code,String token){
        this.data = data;
        this.message = message;
        this.code = code;
        this.token = token;
    }
}
