package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.User;
import com.hello.huqingshan.server.UserServer;
import com.hello.huqingshan.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//先不返回值，请求直接调用数据库，查找完成直接输出进行测试
//添加restful的api
//根据返回的AffectRows来判断是否执行成功

@RestController
public class UserController {

    @Autowired
    private UserServer userServer;

    //查询所用用户
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public Result<List<User>> selectUser(){
        return new Result<>(userServer.selectUser(),"查询用户成功",200,null);
    }

    //通过id查询用户
    @RequestMapping(value = "/user/{uid}",method = RequestMethod.GET)
    public Result<User> selectUserByUid(@PathVariable long uid){
        User user = userServer.selectUserByUid(uid);
        String message = (user != null) ? "查询成功" : "用户不存在";
        int code = (user != null) ? 200 :400;
        //用户不存在则user为null
        return new Result<>(user,message,code,null);
    }

    //更新用户
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public Result<Integer> updateUserInfoByUid(@RequestBody User user){
        int AffectRows = userServer.updateUserInfoByUid(user);

        //注意，? : 是运算符，判断是语句
        String message = (AffectRows != 0) ? "更新用户信息成功" : "更新用户信息失败";
        int code = (AffectRows !=0) ? 200 : 400;
        //这里会做类型推断
        return new Result<>(AffectRows,message,code,null);
    }

    //删除用户
    @RequestMapping(value = "/user/{uid}",method = RequestMethod.DELETE)
    public Result<Integer> deleteUserByUid(@PathVariable long uid){
        System.out.println(uid);
        int AffectRows = userServer.deleteUserByUid(uid);
        String message = (AffectRows != 0) ? "删除用户成功" : "删除用户失败";
        int code = (AffectRows != 0) ? 200 : 400;
        return new Result<>(AffectRows,message,code,null);
    }
}
