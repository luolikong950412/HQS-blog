package com.hello.huqingshan.mapper;

import com.hello.huqingshan.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    //查询
    List<Role> selectRoles();

    //查询
    Role selectRoleByUserId(long id);

    //添加
    int addRole(Role role);

}
