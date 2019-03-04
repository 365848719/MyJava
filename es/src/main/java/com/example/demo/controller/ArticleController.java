package com.example.demo.controller;


import com.example.demo.bean.Comment;
import com.example.demo.dao.ArticleSearchRepository;
import com.example.demo.bean.Article;

import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
public class ArticleController {
    @Autowired
    ArticleSearchRepository articleSearchRepository;

    /*测试通过*/
    @RequestMapping("/article/add")
    public void saveArticle() {
        Article article = new Article();
        article.setId(1L);
        article.setTitle("springboot integreate elasticsearch");
        article.setAbstracts("springboot integreate elasticsearch is very easy");
        article.setContent("elasticsearch based on lucene");
        article.setPostTime(new Date());

        List<Comment> commentList = new ArrayList();

        for (int i = 0;i<10;i ++) {
            Comment comment = new Comment();
            comment.setId(i);
            comment.setUserName(i +": 互联网用户");
            comment.setContent(i +": 文章很好。。。。哈哈。。。");

            commentList.add(comment);

        }

        article.setComments(commentList);

        articleSearchRepository.save(article);

    }

    /*测试通过*/
    @RequestMapping("/article/batchAdd")
    public void batchSaveArticle() {

        ArrayList m = new ArrayList<Article>();

        for (int i = 0; i < 1000; i++) {
            Article article = new Article();

            article.setId(i);

            article.setTitle(i + ": springboot integreate elasticsearch");
            article.setAbstracts(i + ": springboot integreate elasticsearch is very easy");
            article.setContent(i + ": elasticsearch based on lucene");
            article.setPostTime(new Date());

            m.add(article);
        }

        articleSearchRepository.saveAll(m);

    }

    @RequestMapping("/article/delete")
    public void deleteArticle() {
        Article article = new Article();
        article.setId(1);

        articleSearchRepository.delete(article);
    }

    @RequestMapping("/article/batchDelete")
    public void batchDeleteArticles() {

        ArrayList m = new ArrayList<Article>();

        Article article;
        article = new Article();
        article.setId(1);
        m.add(article);


        article = new Article();
        article.setId(2);
        m.add(article);


        article = new Article();
        article.setId(3);
        m.add(article);

        article = new Article();
        article.setId(4);
        m.add(article);


        articleSearchRepository.deleteAll(m);

    }


    @RequestMapping("/article/query")
    public void search() {
        String queryString = "springboot";//搜索关键字
        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);
        Iterable<Article> searchResult = articleSearchRepository.search(builder);
        Iterator<Article> iterator = searchResult.iterator();
        while (iterator.hasNext()) {
            Article article = iterator.next();
            System.out.println(article.getContent());
        }
    }
}
