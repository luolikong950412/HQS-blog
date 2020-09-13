package com.hello.huqingshan.mapper;

import com.hello.huqingshan.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    //查询
    List<Role> selectAllRoles();

    //添加
    int addRole(Role role);

    //删除
    int deleteRoleById(long id);

}
