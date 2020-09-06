package com.hello.huqingshan.server;

import com.hello.huqingshan.mapper.UserMapper;
import com.hello.huqingshan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServer {

    @Autowired
    private UserMapper userMapper;

    //用户注册
    public int registerUser(User user){
        return userMapper.registerUser(user);
    }

    //用户登录
    public User login(User user){
        return userMapper.selectUserByUid(user.getUid());
    }
}
