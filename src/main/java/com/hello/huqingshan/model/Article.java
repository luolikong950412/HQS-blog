package com.hello.huqingshan.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class Article {

    private String title;
    private long id;
    private String content;
    @JsonFormat(pattern = "yyyy年dd月MM日 HH:mm:ss")
    private LocalDateTime createdate;
    private String author;
    private List<Tag> tagList;

}
