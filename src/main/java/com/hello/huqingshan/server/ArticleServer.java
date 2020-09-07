package com.hello.huqingshan.server;

import com.hello.huqingshan.mapper.ArticleMapper;
import com.hello.huqingshan.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServer {
    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> selectArticle(){
        return articleMapper.selectArticle();
    }
    public Article selectArticleById(long id){
        return null;
    }

    public void addArticle(Article article){

    }

    public void deleteArticle(long id){

    }

    public void updateArticleById(Article article){

    }

}
