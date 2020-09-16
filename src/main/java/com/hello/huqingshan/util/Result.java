package com.hello.huqingshan.util;
import lombok.Data;

@Data
public class Result<T> {

    private static final String SUCCESS_MESSAGE = "success";
    private static final String FAIL_MESSAGE = "fail";
    private static final int SUCCESS_CODE = 200;
    private static final int FAIL_CODE = 500;

    private T data;
    private String message;
    private int code;
    private String token;

    public Result(T data,String message,int code,String token){
        this.message = message;
        this.token = token;
        this.data = data;
        this.code = code;
    }

    //方法的泛型和类的泛型不一样
    public static <MT> Result<MT> ofSuccess(String token,MT data){
        return new Result<>(data,SUCCESS_MESSAGE,SUCCESS_CODE,token);
    }

    public static <MT> Result<MT> ofFail(String token,MT data){
        return new Result<>(data,FAIL_MESSAGE,FAIL_CODE,token);
    }
}
