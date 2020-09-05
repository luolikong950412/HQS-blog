package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.User;
import com.hello.huqingshan.server.LoginServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @Autowired
    private LoginServer loginServer;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(@RequestBody User user){
        loginServer.login(user);
        return "login";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@RequestBody User user){
        loginServer.registerUser(user);
        return "success";
    }
}
