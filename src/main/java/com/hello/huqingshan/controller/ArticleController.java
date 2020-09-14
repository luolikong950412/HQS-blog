package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.Article;
import com.hello.huqingshan.server.ArticleServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 先不对返回结果进行判断，只是进行获取和插入，后面细写逻辑
 */

@RestController
public class ArticleController {
    @Autowired
    private ArticleServer articleServer;

    //获取所有文章
    @RequestMapping(value = "/article",method = RequestMethod.GET)
    public List<Article> getAllArticles(){
        return articleServer.getAllArticle();
    }

    //获取指定
    @RequestMapping(value = "/article/{id}",method = RequestMethod.GET)
    public Article getArticleByArticleId(@PathVariable long id){
        return articleServer.getArticleByArticleId(id);
    }

    //删除
    @RequestMapping(value = "/article/{id}",method = RequestMethod.DELETE)
    public int deleteArticleByArticleId(@PathVariable long id){
        return articleServer.deleteArticleByArticleId(id);
    }

    //更新
    @RequestMapping(value = "/article/{id}",method = RequestMethod.PUT)
    public int updateArticle(@RequestBody Article article,@PathVariable long id){
        return articleServer.updateArticleById(article,id);
    }

    //添加
    @RequestMapping(value = "/article",method = RequestMethod.POST)
    public int addArticle(@RequestBody Article article){
         return articleServer.addArticle(article);
    }
}
