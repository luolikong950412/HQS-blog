package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.Role;
import com.hello.huqingshan.server.RoleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private RoleServer roleServer;

    //获取所有角色
    @RequestMapping(value = "/role",method = RequestMethod.GET)
    public List<Role> selectAllRoles(){
        return roleServer.selectAllRoles();
    }

    //删除角色
    @RequestMapping(value = "/role/{id}",method = RequestMethod.DELETE)
    public int deleteRoleById(@PathVariable long id){
        return roleServer.deleteRoleById(id);
    }

    //添加角色
    @RequestMapping(value = "/role",method = RequestMethod.POST)
    public int addRole(@RequestBody Role role){
        return roleServer.addRole(role);
    }

}
