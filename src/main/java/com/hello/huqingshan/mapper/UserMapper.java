package com.hello.huqingshan.mapper;

import com.hello.huqingshan.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectUser();

    User selectUserByUid(long uid);

    int deleteUserByUid(long uid);

    int updateUserInfoByUid(User user);

    //用户注册，可以直接接收一个user对象吗
    //插入，更新，删除默认返回影响的行数
    int registerUser(User user);
}
