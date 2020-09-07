package com.hello.huqingshan.mapper;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Role {

    //查询全部角色
    List<Role> selectRoles();

    //根据用户id查询用户所拥有的角色
    Role selectRoleByUserId();

}
