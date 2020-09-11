package com.hello.huqingshan.mapper;

import com.hello.huqingshan.model.Article;
import org.apache.ibatis.annotations.Mapper;

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

    //查询
    Article selectIdByTitle(String title);
}
