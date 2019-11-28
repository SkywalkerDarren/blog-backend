package com.blog.service;

import com.blog.entity.Comment;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:spring-beans.xml") //设置spring配置文件路径
public class CommentServiceTest {

    @Autowired
    private CommentService commentService;
    private DateTime end = new DateTime();
    private DateTime start = end.minusDays(3);

    @Test
    public void findCommentById() {
        System.out.println(commentService.findCommentById(7));
    }

    @Test
    public void findComment() {
        System.out.println(commentService.findComment("com"));
    }

    @Test
    public void findCommentByUserId() {
        System.out.println(commentService.findCommentByUserId(0));
    }

    @Test
    public void findCommentByDatetimeRangeAndUserId() {
        System.out.println(commentService.findCommentByDatetimeRangeAndUserId(start.toDate(), end.toDate(), 0));
    }

    @Test
    public void findCommentByArticleId() {
        System.out.println(commentService.findCommentByArticleId(1));
    }

    @Test
    public void findCommentByDatetimeRangeAndArticleId() {
        System.out.println(commentService.findCommentByDatetimeRangeAndArticleId(start.toDate(), end.toDate(), 1));
    }

    @Test
    public void findCommentByUserIdAndArticleId() {
        System.out.println(commentService.findCommentByUserIdAndArticleId(0, 1));
    }

    @Test
    public void findCommentByDatetimeRangeAndUserIdAndArticleId() {
        System.out.println(commentService.findCommentByDatetimeRangeAndUserIdAndArticleId(start.toDate(), end.toDate(), 0, 1));
    }

    @Test
    public void findAllComment() {
        System.out.println(commentService.findAllComment());
    }

    @Test
    public void findCommentByDatetimeRange() {
        System.out.println(commentService.findCommentByDatetimeRange(start.toDate(), end.toDate()));
    }

    @Test
    public void editComment() {
        Comment comment = commentService.findCommentById(9);
        comment.setContent("editComment");
        commentService.editComment(comment);
    }

    @Test
    public void deleteComment() {
        commentService.deleteComment(7);
    }

    @Test
    public void saveComment() {
        Comment comment = new Comment();
        comment.setArticleId(1);
        comment.setUserId(0);
        comment.setContent("saveComment");
        commentService.saveComment(comment);
    }
}