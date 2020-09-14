package com.hello.huqingshan.server;

import com.hello.huqingshan.mapper.UserMapper;
import com.hello.huqingshan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//为什么需要这个，没有这个会报空指针错误
@Service
public class UserServer {
    @Autowired
    private UserMapper userMapper;

    //查询所有用户
    public List<User> selectUser(){
            return userMapper.selectUser();
    }

    //通过id删除
    public int deleteUserByUid(long uid){
        //通过id删除用户
        if(userMapper.deleteUserByUid(uid)!=0){
            //同时删除用户角色映射
            return userMapper.deleteUserRoleById(uid);
        }
        return 0;
    }

    //更新
    public int updateUserInfoByUid(User user){
        return userMapper.updateUserInfoByUid(user);
    }

    //通过id查询用户
    public User selectUserByUid(long uid){
        return userMapper.selectUserByUid(uid);
    }

}
