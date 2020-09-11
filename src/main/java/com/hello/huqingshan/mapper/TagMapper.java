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

    //添加标签映射
    int add_article_tag(@Param("tagList") List<Tag> tagList,@Param("articleId") long articleId);
}
