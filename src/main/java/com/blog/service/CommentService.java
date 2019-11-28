package com.blog.service;

import com.blog.entity.Comment;

import java.util.Date;
import java.util.List;

public interface CommentService {
    /**
     * 根据评论id查找评论
     */
    Comment findCommentById(Integer id);

    /**
     * 模糊查找评论
     */
    List<Comment> findComment(String comment);

    /**
     * 根据用户id查找其所有评论
     */
    List<Comment> findCommentByUserId(Integer id);

    /**
     * 根据用户id查找时间段内所有评论
     */
    List<Comment> findCommentByDatetimeRangeAndUserId(Date start, Date end, Integer id);

    /**
     * 根据文章id查找文章下所有评论
     */
    List<Comment> findCommentByArticleId(Integer id);

    /**
     * 根据文章id查找文章下时间段内所有评论
     */
    List<Comment> findCommentByDatetimeRangeAndArticleId(Date start, Date end, Integer id);

    /**
     * 根据用户id,文章id查找其所有评论
     */
    List<Comment> findCommentByUserIdAndArticleId(Integer userId, Integer articleId);

    /**
     * 根据用户id,文章id查找时间段内所有评论
     */
    List<Comment> findCommentByDatetimeRangeAndUserIdAndArticleId(Date start, Date end, Integer userId, Integer articleId);

    /**
     * 查找所有评论
     */
    List<Comment> findAllComment();

    /**
     * 查找时间段内所有评论
     */
    List<Comment> findCommentByDatetimeRange(Date start, Date end);

    /**
     * 修改评论
     */
    void editComment(Comment comment);

    /**
     * 删除评论
     */
    void deleteComment(Integer id);

    /**
     * 新评论
     */
    void saveComment(Comment comment);
}
