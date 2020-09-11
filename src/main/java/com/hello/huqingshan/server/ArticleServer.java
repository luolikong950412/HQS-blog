package com.hello.huqingshan.server;

import com.hello.huqingshan.mapper.ArticleMapper;
import com.hello.huqingshan.mapper.TagMapper;
import com.hello.huqingshan.model.Article;
import com.hello.huqingshan.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServer {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private TagMapper tagMapper;

    //查询
    public List<Article> selectArticle(){
        return articleMapper.selectArticle();
    }

    //查询
    public Article selectArticleById(long id){
        return articleMapper.selectArticleById(id);
    }

    //添加
    public void addArticle(Article article){
        //如何让这两个其中一个失败另一个不执行呢
        //如何获取文章的id呢，得插入之后才知道，或者插入之后找出来?
        articleMapper.addArticle(article);
        Article article1 = articleMapper.selectIdByTitle(article.getTitle());
        //添加标签
        List<Tag> tagList = article.getTagList();
        tagMapper.add_article_tag(tagList,article1.getId());

    }

    //删除
    public int deleteArticleById(long id){
        return articleMapper.deleteArticleById(id);
    }

    //更新
    public int updateArticleById(Article article){
        return articleMapper.updateArticle(article);
    }

}
