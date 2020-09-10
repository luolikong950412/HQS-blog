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
        return articleMapper.selectArticleById(id);
    }

    public int addArticle(Article article){
        return articleMapper.addArticle(article);
    }

    public int deleteArticleById(long id){
        return articleMapper.deleteArticleById(id);
    }

    public int updateArticleById(Article article){
        return articleMapper.updateArticle(article);
    }

}
