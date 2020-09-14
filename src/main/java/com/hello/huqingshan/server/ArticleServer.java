package com.hello.huqingshan.server;

import com.hello.huqingshan.mapper.ArticleMapper;
import com.hello.huqingshan.model.Article;
import com.hello.huqingshan.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServer {
    @Autowired
    private ArticleMapper articleMapper;

    //查询
    public List<Article> getAllArticle(){
        return articleMapper.selectArticle();
    }

    //查询
    public Article getArticleByArticleId(long id){
        return articleMapper.selectArticleById(id);
    }

    //添加文章
    public int addArticle(Article article){
        //插入文章失败后只能删除文章？
        if(articleMapper.addArticle(article) != 0){
            long id = article.getId();
            //是否需要判断标签列表是否为空
            List<Tag> tagList = article.getTagList();
            return articleMapper.addArticleTag(tagList,id);
        }
        return 0;
    }

    //删除
    public int deleteArticleByArticleId(long id){
        //删除文章
        if(articleMapper.deleteArticleById(id)!=0){
            //删除文章标签映射
            return articleMapper.deleteArticleTagById(id);
        }
        return 0;
    }

    //更新
    //这里更新文章和文章标签是一起的，没有把更新文章和标签拆开
    public int updateArticleById(Article article,long id){
        //把id写入model
        article.setId(id);
        //更新文章
        if(articleMapper.updateArticle(article)!=0){
            //更新文章标签映射
            //是否需要判断用户标签没有修改，不需要改变
//            return articleMapper.updateArticleTagById(article.getId());
            return 1;
        }
        return 0;
    }

}
