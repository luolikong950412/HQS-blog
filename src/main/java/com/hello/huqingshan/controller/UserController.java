package com.hello.huqingshan.controller;

import com.hello.huqingshan.mapper.UserMapper;
import com.hello.huqingshan.model.User;
import com.hello.huqingshan.server.UserServer;
import com.hello.huqingshan.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServer userServer;
    @Autowired
    private UserMapper userMapper;

    //查询所用用户
    @GetMapping("/user")
    public Result<List<User>> selectUser(){
        List<User> userList = userServer.selectUser();
        return Result.ofSuccess(null,userList);
    }

    //通过id查询用户
    @GetMapping("/user/{uid}")
    public Result<User> selectUserByUid(@PathVariable long uid){
        User user = userServer.selectUserByUid(uid);
        return Result.ofSuccess(null,user);
    }

    //更新用户
    @PutMapping("/user")
    public Result<Integer> updateUserInfoByUid(@RequestBody User user){
        int affectRows = userServer.updateUserInfoByUid(user);
        return Result.ofSuccess(null,affectRows);
    }

    //删除用户
    @DeleteMapping("/user/{uid}")
    public Result<Integer> deleteUserByUid(@PathVariable long uid){
        int affectRows = userServer.deleteUserByUid(uid);
        return Result.ofSuccess(null,affectRows);
    }
}
