package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.Article;
import com.hello.huqingshan.model.Tag;
import com.hello.huqingshan.server.TagServer;
import com.hello.huqingshan.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TagController {
    @Autowired
    private TagServer tagServer;

    //添加
    @PostMapping("/tag")
    public Result<Integer> addTag(@RequestBody Tag tag){
        int affectRows = tagServer.addTag(tag);
        return Result.ofSuccess(null,affectRows);
    }

    //删除
    @DeleteMapping("/tag/{id}")
    public Result<Integer> deleteTagById(@PathVariable long id){
        int affectRows = tagServer.deleteTagById(id);
        return Result.ofSuccess(null,affectRows);
    }

    //获取所有标签
    @GetMapping("/tag")
    public Result<List<Tag>> selectAllTags(){
        List<Tag> tagList = tagServer.selectTag();
        return Result.ofSuccess(null,tagList);
    }

    //通过标签id获取标签下的所有文章
    @GetMapping("/tag/{id}")
    public Result<List<Article>> getAllArticleByTagId(@PathVariable long id){
        List<Article> articleList = tagServer.getAllArticleByTagId(id);
        return Result.ofSuccess(null,articleList);
    }
}
