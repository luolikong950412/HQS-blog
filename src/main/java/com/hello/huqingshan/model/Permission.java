package com.hello.huqingshan.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Permission {
    private long Pid;
    private String method;
    private String url;
}
