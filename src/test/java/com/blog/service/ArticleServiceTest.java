package com.blog.service;

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

    @Test
    public void findArticleById() {
        articleService.findArticleById(2);
    }

    @Test
    public void findArticleByTitle() {

    }

    @Test
    public void findArticleByDatetimeRange() {
    }

    @Test
    public void findAllArticle() {
    }

    @Test
    public void updateArticle() {
    }

    @Test
    public void deleteArticle() {
    }

    @Test
    public void saveArticle() {
    }
}