package com.hello.huqingshan.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

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
    //由于在mysql中并没有数组字段，该如何处理
    private List<Role> roleList;

    @JsonFormat(pattern = "yyyy年MM月dd号 HH:mm:ss") //把从数据库获取的时间格式化,不传时区行不行
    @DateTimeFormat(pattern = "yyyy年-MM月-dd号 HH:mm:ss") //把传入的时间格式化
    private LocalDateTime createdate;
    private String icon;

    //为什么还要提供一个无参构造函数给mybatis如果存在有参构造函数的话
    public User(){ }
}