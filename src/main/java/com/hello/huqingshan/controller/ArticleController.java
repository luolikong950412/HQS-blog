package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.Article;
import com.hello.huqingshan.server.ArticleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    private ArticleServer articleServer;

    @RequestMapping(value = "/article",method = RequestMethod.GET)
    public List<Article> selectArticle(){
        return articleServer.selectArticle();
    }

    @RequestMapping(value = "/article/{id}",method = RequestMethod.GET)
    public Article selectArticleById(@PathVariable long id){
        return null;
    }

    @RequestMapping(value = "/article/{id}",method = RequestMethod.DELETE)
    public void deleteArticleById(@PathVariable long id){

    }

    @RequestMapping(value = "/article",method = RequestMethod.PUT)
    public void updateArticle(@RequestBody Article article){

    }

    @RequestMapping(value = "/article/{id}",method = RequestMethod.POST)
    public void addArticle(@PathVariable long id){

    }
}
