package com.hello.huqingshan.mapper;

import com.hello.huqingshan.model.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {

    List<Article> selectArticle();

    Article selectArticleById(long id);

    int deleteArticleById(long id);

    int updateArticle(Article article);

    int addArticle(Article article);
}
