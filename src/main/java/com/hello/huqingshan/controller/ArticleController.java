package com.hello.huqingshan.controller;

import com.hello.huqingshan.model.Article;
import com.hello.huqingshan.server.ArticleServer;
import com.hello.huqingshan.util.Result;
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
    @GetMapping("/article")
    public Result<List<Article>>  getAllArticles(){
        List<Article> list = articleServer.getAllArticle();
        return Result.ofSuccess(null,list);
    }

    //获取指定
    @GetMapping("/article/{id}")
    public Result<Article> getArticleByArticleId(@PathVariable long id){
        Article article =  articleServer.getArticleByArticleId(id);
        return Result.ofSuccess(null,article);
    }

    //删除
    @DeleteMapping("/article/{id}")
    public Result<Integer> deleteArticleByArticleId(@PathVariable long id){
        int affectRows =  articleServer.deleteArticleByArticleId(id);
        return Result.ofSuccess(null,affectRows);
    }

    //更新
    @PutMapping("/article/{id}")
    public Result<Integer> updateArticle(@RequestBody Article article, @PathVariable long id){
        int affectRows =  articleServer.updateArticleById(article,id);
        return Result.ofSuccess(null,affectRows);
    }

    //添加
    @PostMapping("/article")
    public Result<Integer> addArticle(@RequestBody Article article){
         int affectRows = articleServer.addArticle(article);
         return Result.ofSuccess(null,affectRows);
    }
}
