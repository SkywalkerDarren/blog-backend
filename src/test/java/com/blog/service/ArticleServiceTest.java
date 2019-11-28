package com.blog.service;

import com.blog.entity.Article;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:spring-beans.xml") //设置spring配置文件路径
public class ArticleServiceTest {

    @Autowired
    private ArticleService articleService;
    private DateTime end = new DateTime();
    private DateTime start = end.minusDays(3);

    @Test
    public void findArticleById() {
        System.out.println(articleService.findArticleById(2));
    }

    @Test
    public void findArticleByTitle() {
        System.out.println(articleService.findArticleByTitle(""));
    }

    @Test
    public void findArticleByDatetimeRange() {
        System.out.println(articleService.findArticleByDatetimeRange(start.toDate(), end.toDate()));
    }

    @Test
    public void findAllArticle() {
        System.out.println(articleService.findAllArticle());
    }

    @Test
    public void updateArticle() {
        Article article = articleService.findArticleById(2);
        article.setTitle("updateArticle");
        articleService.updateArticle(article);
    }

    @Test
    public void deleteArticle() {
        articleService.deleteArticle(5);
    }

    @Test
    public void saveArticle() {
        Article article = new Article();
        article.setTitle("save");
        article.setUserId(0);
        articleService.saveArticle(article);
    }
}