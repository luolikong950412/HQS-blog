package com.hello.huqingshan.util;

import com.hello.huqingshan.model.Result;

public class ResultGenerate {

    //全局变量，解耦?
    private static final int SUCCESS_CODE = 200;
    private static final int FAIL_CODE = 500;

    //使用静态方法来返回结果对象，直接使用对象不直观，没有名字
    //但是结果类的数据是泛型的，该如何处理
    //泛型方法
    //注意，返回类型Result<T>中的T，和参数类型的的T，和里面创建的Result对象的T是一样的，而static <T>只不过说明这是一个泛型方法
    //和声明一个泛型类public class hello <T>是一样的
    //例如public <T> void getExample(){
    //}

    //但对于泛型方法的调用
    //如果是泛型类，需要指定泛型参数的类型，String，Integer等，否则是Object类型
    //对于泛型方法来说，其也可以进行类型推断，也可以显示指定类型ResultGenerate.<User>getSuccessRsult
    //而泛型类的则需要指定第一个类型 List<User> list = new ArrayList<>();


    //这里只是用静态方法封装了，其实也可以直接使用Result类
    public static <T> Result<T> getSuccessResult(T data, String token, String message){
        Result<T> result = new Result<>();
        result.setCode(SUCCESS_CODE);
        result.setMessage(message);
        result.setToken(token);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> getFailResult(T data, String token, String message){
        Result<T> result = new Result<>();
        result.setCode(FAIL_CODE);
        result.setToken(token);
        result.setMessage(message);
        return result;
    }

}
