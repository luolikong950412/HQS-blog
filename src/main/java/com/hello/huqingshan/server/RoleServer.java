package com.hello.huqingshan.server;

import com.hello.huqingshan.mapper.RoleMapper;
import com.hello.huqingshan.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServer {
    @Autowired
    private RoleMapper roleMapper;

    //添加
    public int addRole(Role role){
        return roleMapper.addRole(role);
    }

    //删除
    public int deleteRoleById(long id){
        return roleMapper.deleteRoleById(id);
    }

    //获取
    public List<Role> selectAllRoles(){
        return roleMapper.selectAllRoles();
    }

    //获取指定角色下的用户
}
