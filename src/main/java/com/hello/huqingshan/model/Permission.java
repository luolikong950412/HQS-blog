package com.hello.huqingshan.model;

import lombok.Data;

@Data
public class Permission {
    private long Pid;
    private String method;
    private String url;
}
