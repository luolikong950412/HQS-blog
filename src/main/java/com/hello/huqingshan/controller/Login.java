package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.User;
import com.hello.huqingshan.server.LoginServer;
import com.hello.huqingshan.util.Result;
import com.hello.huqingshan.util.ResultGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
    @Autowired
    private LoginServer loginServer;

    //登录接口
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Result<User> login(@RequestBody User user){
        return null;
    }

    //注册接口
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Result<Integer> register(@RequestBody User user){
        int AffectRows = loginServer.registerUser(user);
        if(AffectRows >0){
            return ResultGenerate.getSuccessResult(AffectRows,null,"注册成功");
        }
        else {
            return ResultGenerate.getFailResult(AffectRows,null,"注册失败");
        }
    }
}
