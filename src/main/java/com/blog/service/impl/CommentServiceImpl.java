package com.blog.service.impl;

import com.blog.dao.CommentDao;
import com.blog.entity.Comment;
import com.blog.service.CommentService;
import com.blog.utils.CheckTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public Comment findCommentById(Integer id) {
        return commentDao.findCommentById(id);
    }

    @Override
    public List<Comment> findComment(String comment) {
        String like = "%" + comment + "%";
        return commentDao.findComment(like);
    }

    @Override
    public List<Comment> findCommentByUserId(Integer id) {
        return commentDao.findCommentByUserId(id);
    }

    @Override
    public List<Comment> findCommentByDatetimeRangeAndUserId(Date start, Date end, Integer id) {
        CheckTool.checkDate(start, end);
        return commentDao.findCommentByDatetimeRangeAndUserId(start, end, id);
    }

    @Override
    public List<Comment> findCommentByArticleId(Integer id) {
        return commentDao.findCommentByArticleId(id);
    }

    @Override
    public List<Comment> findCommentByDatetimeRangeAndArticleId(Date start, Date end, Integer id) {
        CheckTool.checkDate(start, end);
        return commentDao.findCommentByDatetimeRangeAndArticleId(start, end, id);
    }

    @Override
    public List<Comment> findCommentByUserIdAndArticleId(Integer userId, Integer articleId) {
        return commentDao.findCommentByUserIdAndArticleId(userId, articleId);
    }

    @Override
    public List<Comment> findCommentByDatetimeRangeAndUserIdAndArticleId(Date start, Date end, Integer userId, Integer articleId) {
        CheckTool.checkDate(start, end);
        return commentDao.findCommentByDatetimeRangeAndUserIdAndArticleId(start, end, userId, articleId);
    }

    @Override
    public List<Comment> findAllComment() {
        return commentDao.findAllComment();
    }

    @Override
    public List<Comment> findCommentByDatetimeRange(Date start, Date end) {
        CheckTool.checkDate(start, end);
        return commentDao.findCommentByDatetimeRange(start, end);
    }

    @Override
    public void editComment(Comment comment) {
        commentDao.editComment(comment);
    }

    @Override
    public void deleteComment(Integer id) {
        commentDao.deleteComment(id);
    }

    @Override
    public void saveComment(Comment comment) {
        commentDao.saveComment(comment);
    }
}
