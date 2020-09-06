package com.hello.huqingshan.util;

//返回封装结果，结果内容如下
//但是结果类的数据是泛型的，该如何处理
//成功
//失败
public class ResultGenerate {

    //全局变量的作用，耦合？
    private String SUCCESS_MESSAGE = "SUCCESS";
    private String FAIL_MESSAGE = "FAIL";
    private int SUCCESS_CODE = 200;
    private int FAIL_CODE = 500;

    public static Result getSuccessResult(){
        return null;
    }

    public static Result getFialResult(){
        return null;
    }

}
