package com.hello.huqingshan.server;

import com.hello.huqingshan.mapper.UserMapper;
import com.hello.huqingshan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServer {

    @Autowired
    private UserMapper userMapper;

    public int registerUser(User user){
        return userMapper.registerUser(user);
    }

    public User login(User user){
        return userMapper.selectUserByUid(user.getUid());
    }
}
