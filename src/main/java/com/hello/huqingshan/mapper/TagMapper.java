package com.hello.huqingshan.mapper;

import com.hello.huqingshan.model.Article;
import com.hello.huqingshan.model.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TagMapper {

    //添加
    int addTag(Tag tag);

    //删除
    int deleteTagById(long id);

    //获取
    List<Tag> selectTag();

    //获取标签下的所有文章
    List<Article> getAllArticleByTagId(long id);
}
