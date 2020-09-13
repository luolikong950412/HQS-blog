package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.Tag;
import com.hello.huqingshan.server.TagServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TagController {
    @Autowired
    private TagServer tagServer;

    //添加
    @RequestMapping(value = "/tag",method = RequestMethod.POST)
    public int addTag(@RequestBody Tag tag){
        return tagServer.addTag(tag);
    }

    //删除
    @RequestMapping(value = "/tag/{id}",method = RequestMethod.DELETE)
    public int deleteTagById(@PathVariable long id){
        return tagServer.deleteTagById(id);
    }

    //获取所有标签
    @RequestMapping(value = "/tag",method = RequestMethod.GET)
    public List<Tag> selectAllTags(){
        return tagServer.selectTag();
    }
}
