package com.hello.huqingshan.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Article {

    private String articlename;
    private int articleid;
    private String content;
    private LocalDateTime createdate;
    private String author;

}
