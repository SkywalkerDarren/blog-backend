package com.blog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:spring-beans.xml") //设置spring配置文件路径
public class CommentServiceTest {

    @Test
    public void findCommentById() {
    }

    @Test
    public void findComment() {
    }

    @Test
    public void findCommentByUserId() {
    }

    @Test
    public void findCommentByDatetimeRangeAndUserId() {
    }

    @Test
    public void findCommentByArticleId() {
    }

    @Test
    public void findCommentByDatetimeRangeAndArticleId() {
    }

    @Test
    public void findCommentByUserIdAndArticleId() {
    }

    @Test
    public void findCommentByDatetimeRangeAndUserIdAndArticleId() {
    }

    @Test
    public void findAllComment() {
    }

    @Test
    public void findCommentByDatetimeRange() {
    }

    @Test
    public void editComment() {
    }

    @Test
    public void deleteComment() {
    }

    @Test
    public void saveComment() {
    }
}