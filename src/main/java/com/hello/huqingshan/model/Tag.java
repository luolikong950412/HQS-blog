package com.hello.huqingshan.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Tag {

    private String TagName;
    private long TagId;

    public Tag(){}

    public Tag(String TagName){
        this.TagName = TagName;
    }
}
