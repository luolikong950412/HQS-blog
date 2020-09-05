package com.hello.huqingshan.server;

import com.hello.huqingshan.mapper.UserMapper;
import com.hello.huqingshan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServer {

    @Autowired
    private UserMapper userMapper;

    public void registerUser(User user){
        userMapper.registerUser(user);
    }

    public void login(User user){
        System.out.println("login");
    }
}
