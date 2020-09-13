package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.User;
import com.hello.huqingshan.server.LoginAndRegisterServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginAndRegister {
    @Autowired
    private LoginAndRegisterServer loginAndRegisterServer;

    //登录
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public int login(@RequestBody User user){
        return loginAndRegisterServer.login(user);
    }

    //注册
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public int register(@RequestBody User user){
        return loginAndRegisterServer.registerUser(user);
    }
}
