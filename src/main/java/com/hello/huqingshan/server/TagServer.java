package com.hello.huqingshan.server;

import com.hello.huqingshan.mapper.TagMapper;
import com.hello.huqingshan.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServer {
    @Autowired
    private TagMapper tagMapper;

    //添加
    public int addTag(Tag tag){
        return tagMapper.addTag(tag);
    }

    //删除
    //已经关联标签的文章怎么办
    public int deleteTagById(long id){
        return tagMapper.deleteTagById(id);
    }

    //获取
    public List<Tag> selectTag(){
        return tagMapper.selectTag();
    }

    //获取指定标签下的文章
}
