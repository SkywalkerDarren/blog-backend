package com.blog.dao;

import com.blog.entity.Comment;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class CommentDaoTest {

    @Autowired
    CommentDao commentDao;

    @Test
    public void findCommentById() {
        System.out.println(commentDao.findCommentById(1));
    }

    @Test
    public void findComment() {
        System.out.println(commentDao.findComment("%1%"));
    }

    @Test
    public void findCommentByUserId() {
        System.out.println(commentDao.findCommentByUserId(0));
    }

    @Test
    public void findCommentByDatetimeRangeAndUserId() {
        DateTime end = new DateTime();
        DateTime start = end.minusDays(3);
        System.out.println(commentDao.findCommentByDatetimeRangeAndUserId(start.toDate(), end.toDate(), 0));
    }

    @Test
    public void findCommentByArticleId() {
        System.out.println(commentDao.findCommentByArticleId(1));
    }

    @Test
    public void findCommentByDatetimeRangeAndArticleId() {
        DateTime end = new DateTime();
        DateTime start = end.minusDays(3);
        System.out.println(commentDao.findCommentByDatetimeRangeAndArticleId(start.toDate(), end.toDate(), 1));
    }

    @Test
    public void findCommentByUserIdAndArticleId() {
        System.out.println(commentDao.findCommentByUserIdAndArticleId(2,1));
    }

    @Test
    public void findCommentByDatetimeRangeAndUserIdAndArticleId() {
        DateTime end = new DateTime();
        DateTime start = end.minusDays(3);
        System.out.println(commentDao.findCommentByDatetimeRangeAndUserIdAndArticleId(start.toDate(), end.toDate(), 2, 1));
    }

    @Test
    public void findAllComment() {
        System.out.println(commentDao.findAllComment());
    }

    @Test
    public void findCommentByDatetimeRange() {
        DateTime end = new DateTime();
        DateTime start = end.minusDays(3);
        System.out.println(commentDao.findCommentByDatetimeRange(start.toDate(), end.toDate()));
    }

    @Test
    public void editComment() {
        Comment comment = commentDao.findCommentById(5);
        comment.setContent("qwer");
        commentDao.editComment(comment);
    }

    @Test
    public void deleteComment() {
        commentDao.deleteComment(6);
    }

    @Test
    public void saveComment() {
        Comment comment = new Comment();
        comment.setArticleId(1);
        comment.setUserId(1);
        comment.setDatetime(new Date());
        comment.setContent("comment");
        commentDao.saveComment(comment);
    }
}