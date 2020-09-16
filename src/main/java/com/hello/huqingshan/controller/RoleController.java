package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.Role;
import com.hello.huqingshan.server.RoleServer;
import com.hello.huqingshan.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private RoleServer roleServer;

    //获取所有角色
    @GetMapping("/role")
    public Result<List<Role>> selectAllRoles(){
        List<Role> roleList = roleServer.selectAllRoles();
        return Result.ofSuccess(null,roleList);
    }

    //删除角色
    @DeleteMapping("/role/{id}")
    public Result<Integer> deleteRoleById(@PathVariable long id){
        int affectRows = roleServer.deleteRoleById(id);
        return Result.ofSuccess(null,affectRows);
    }

    //添加角色
    @PostMapping("/role")
    public Result<Integer> addRole(@RequestBody Role role){
        int affectRows = roleServer.addRole(role);
        return Result.ofSuccess(null,affectRows);
    }

}
