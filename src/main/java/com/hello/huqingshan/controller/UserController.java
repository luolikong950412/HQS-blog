package com.hello.huqingshan.controller;

import com.hello.huqingshan.mapper.UserMapper;
import com.hello.huqingshan.model.Role;
import com.hello.huqingshan.model.User;
import com.hello.huqingshan.server.UserServer;
import com.hello.huqingshan.model.Result;
import com.hello.huqingshan.util.ResultGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//添加restful的api
//根据返回的AffectRows来判断是否执行成功

@RestController
public class UserController {

    @Autowired
    private UserServer userServer;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/role",method = RequestMethod.GET)
    public List<Role> selectRole(){
        return null;
    }

    //查询所用用户
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public Result<List<User>> selectUser(){
        List<User> userList = userServer.selectUser();
        if(userList != null){
            return ResultGenerate.getSuccessResult(userList,null,"查询所有用户成功");
        }
        else{
            return ResultGenerate.getFailResult(null,null,"查询所有用户失败");
        }
    }

    //通过id查询用户
    @RequestMapping(value = "/user/{uid}",method = RequestMethod.GET)
    public Result<User> selectUserByUid(@PathVariable long uid){
        User user = userServer.selectUserByUid(uid);
        if(user != null){
            return ResultGenerate.getSuccessResult(user,null,"通过ID查询用户查询成功");
        }
        else{
            return ResultGenerate.getFailResult(null,null,"用户不存在");
        }
    }

    //更新用户
    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public Result<Integer> updateUserInfoByUid(@RequestBody User user){
        int AffectRows = userServer.updateUserInfoByUid(user);
        if(AffectRows >0){
            return ResultGenerate.getSuccessResult(AffectRows,null,"通过ID更新用户成功");
        }
        else{
            return ResultGenerate.getFailResult(AffectRows,null,"用户不存在");
        }
    }

    //删除用户
    @RequestMapping(value = "/user/{uid}",method = RequestMethod.DELETE)
    public Result<Integer> deleteUserByUid(@PathVariable long uid){
        int AffectRows = userServer.deleteUserByUid(uid);
        if(AffectRows >0){
            return ResultGenerate.getSuccessResult(AffectRows,null,"通过id删除用户成功");
        }
        else{
            return ResultGenerate.getFailResult(AffectRows,null,"用户不存在");
        }
    }
}
