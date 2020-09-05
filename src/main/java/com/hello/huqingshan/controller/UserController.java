package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.User;
import com.hello.huqingshan.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//先不返回值，请求直接调用数据库，查找完成直接输出进行测试
//添加restful的api

@RestController
public class UserController {

    @Autowired
    private UserServer userServer;

    //查询所用用户
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> selectUser(){
        return userServer.selectUser();
    }

    //通过id查询用户
    @RequestMapping(value = "/user/{uid}",method = RequestMethod.GET)
    public User selectUserByUid(@PathVariable long uid){
        return userServer.selectUserByUid(uid);
    }

    //更新用户
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUserInfojByUid(@RequestBody User user){
        userServer.updateUserInfoByUid(user);
        return "success";
    }

    //删除用户
    @RequestMapping(value = "/user/{uid}",method = RequestMethod.DELETE)
    public String deleteUserByUid(@PathVariable long uid){
        userServer.deleteUserByUid(uid);
        return "success";
    }
}
