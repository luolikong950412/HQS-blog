package com.hello.huqingshan.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    List<RoleMapper> selectRoles();

    RoleMapper selectRoleByUserId(long id);

}
