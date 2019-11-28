package com.blog.dao;

import com.blog.entity.Article;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class ArticleDaoTest {

    @Autowired
    private ArticleDao articleDao;

    @Test
    public void findArticleById() {
        System.out.println(articleDao.findArticleById(4));
    }

    @Test
    public void findArticleByTitle() {
        System.out.println(articleDao.findArticleByTitle("%article%"));
    }

    @Test
    public void findArticleByDatetimeRange() {
        DateTime end = new DateTime();
        DateTime start = end.minusDays(3);
        System.out.println(articleDao.findArticleByDatetimeRange(start.toDate(), end.toDate()));
    }

    @Test
    public void findAllArticle() {
        System.out.println(articleDao.findAllArticle());
    }

    @Test
    public void updateArticle() {
        Article article = articleDao.findArticleById(4);
        System.out.println(article);
        article.setDatetime(new Date());
        article.setTitle("title");
        article.setUserId(0);
        articleDao.updateArticle(article);
    }

    @Test
    public void deleteArticle() {
        articleDao.deleteArticle(6);
    }

    @Test
    public void saveArticle() {
        Article article = new Article();
        article.setDatetime(new Date());
        article.setTitle("title");
        article.setUserId(0);
        articleDao.saveArticle(article);
    }
}