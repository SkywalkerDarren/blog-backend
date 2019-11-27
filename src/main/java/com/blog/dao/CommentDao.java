package com.blog.dao;

import com.blog.entity.Comment;
import org.joda.time.DateTime;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author darren
 * TODO:完善评论数查询限制
 */
@Repository
public interface CommentDao {

    /**
     * 根据评论id查找评论
     */
    Comment findCommentById(int id);

    /**
     * 模糊查找评论
     */
    List<Comment> findComment(String comment);

    /**
     * 根据用户id查找其所有评论
     */
    List<Comment> findCommentByUserId(int id);

    /**
     * 根据用户id查找时间段内所有评论
     */
    List<Comment> findCommentByDatetimeRangeAndUserId(DateTime start, DateTime end, int id);

    /**
     * 根据文章id查找文章下所有评论
     */
    List<Comment> findCommentByArticleId(int id);

    /**
     * 根据文章id查找文章下时间段内所有评论
     */
    List<Comment> findCommentByDatetimeRangeAndArticleId(DateTime start, DateTime end, int id);

    /**
     * 根据用户id,文章id查找其所有评论
     */
    List<Comment> findCommentByUserIdAndArticleId(int userId, int articleId);

    /**
     * 根据用户id,文章id查找时间段内所有评论
     */
    List<Comment> findCommentByDatetimeRangeAndUserIdAndArticleId(DateTime start, DateTime end, int userId, int articleId);

    /**
     * 查找所有评论
     */
    List<Comment> findAllComment();

    /**
     * 查找时间段内所有评论
     */
    List<Comment> findCommentByDatetimeRange(DateTime start, DateTime end);

    /**
     * 修改评论
     */
    void updateComment(Comment comment);

    /**
     * 删除评论
     */
    void deleteComment(int id);

    /**
     * 新评论
     */
    void saveComment(Comment comment);
}
