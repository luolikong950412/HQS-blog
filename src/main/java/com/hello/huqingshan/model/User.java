package com.hello.huqingshan.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class User {

    private String username;
    private String password;
    private String nickname;
    private String email;
    //需要注意的是数值类型，和service传递的，controller传递的类型是要一样的
    private long uid;
    private boolean status;
    private LocalDateTime createtime;
    private String icon;

    //为什么还要提供一个无参构造函数
    public User(){ }

    //set方法可以后期修改对象的属性，如果没有set方法没办法修改，构造函数设置参数和set不一样
    public User(String username,String password,int uid,boolean status,LocalDateTime createtime,String icon){
        this.username = username;
        this.password = password;
        this.uid = uid;
        this.status = status;
        this.createtime = createtime;
        this.icon = icon;
    }
}