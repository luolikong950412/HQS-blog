package com.hello.huqingshan.mapper;

import com.hello.huqingshan.model.Article;
import com.hello.huqingshan.model.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMapper {

    //查询
    List<Article> selectArticle();

    //查询
    Article selectArticleById(long id);

    //删除
    int deleteArticleById(long id);

    //更新
    int updateArticle(Article article);

    //添加
    int addArticle(Article article);

    //添加文章标签标签
    int addArticleTag(@Param("tagList")List<Tag> tagList,@Param("id")long id);

    //删除文章标签映射
    int deleteArticleTagById(long id);

    //更新文章标签映射
    int updateArticleTagById(long id);
}
