package com.hello.huqingshan.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

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

    @JsonFormat(pattern = "yyyy年MM月dd号 HH:mm:ss") //把从数据库获取的时间格式化,不传时区行不行
    @DateTimeFormat(pattern = "yyyy年-MM月-dd号 HH:mm:ss") //把传入的时间格式化
    private LocalDateTime createdate;
    private String icon;

    //为什么还要提供一个无参构造函数
    public User(){ }

    //set方法可以后期修改对象的属性，如果没有set方法没办法修改，构造函数设置参数和set不一样
    public User(String username,String password,int uid,boolean status,LocalDateTime createdate,String icon){
        this.username = username;
        this.password = password;
        this.uid = uid;
        this.status = status;
        this.createdate = createdate;
        this.icon = icon;
    }
}