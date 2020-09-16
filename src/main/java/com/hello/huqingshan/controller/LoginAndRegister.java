package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.User;
import com.hello.huqingshan.server.LoginAndRegisterServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginAndRegister {
    @Autowired
    private LoginAndRegisterServer loginAndRegisterServer;

    //登录
    @GetMapping("/login")
    public int login(@RequestBody User user){
        return loginAndRegisterServer.login(user);
    }

    //注册
    @PostMapping("/register")
    public int register(@RequestBody User user){
        return loginAndRegisterServer.registerUser(user);
    }
}
