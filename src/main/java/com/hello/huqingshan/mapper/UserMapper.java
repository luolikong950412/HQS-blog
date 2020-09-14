package com.hello.huqingshan.mapper;

import com.hello.huqingshan.model.Role;
import com.hello.huqingshan.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectUser();

    User selectUserByUid(long uid);

    //删除用户
    int deleteUserByUid(long uid);

    //同时删除用户角色映射
    int deleteUserRoleById(long id);

    //更新用户
    int updateUserInfoByUid(User user);

    //同时更新用户角色映射表
    int updateUserRoleById(long id);

    int registerUser(User user);

    List<Role> selectRolesByUid(long uid);

}
