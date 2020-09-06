package com.hello.huqingshan.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Role {

    private String RoleName;
    private long RoleId;

    public Role(){}

    public Role(String RoleName){
        this.RoleName = RoleName;
    }
}
