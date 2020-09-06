package com.hello.huqingshan.controller;

import com.hello.huqingshan.mapper.TagMapper;
import com.hello.huqingshan.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TagController {
    @Autowired
    private TagMapper tagMapper;

    @RequestMapping(value = "/tag",method = RequestMethod.GET)
    public List<Tag> getTag(){
        return tagMapper.selectTags();
    }

    @RequestMapping(value = "/tag/{tagid}",method = RequestMethod.DELETE)
    public String deleteTagById(){
        return "删除标签";
    }
}
