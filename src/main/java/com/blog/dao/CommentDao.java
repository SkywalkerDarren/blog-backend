package com.blog.dao;

import com.blog.entity.Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
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
    Comment findCommentById(@Param("id") Integer id);

    /**
     * 模糊查找评论
     */
    List<Comment> findComment(@Param("keyword") String comment);

    /**
     * 根据用户id查找其所有评论
     */
    List<Comment> findCommentByUserId(@Param("id") Integer id);

    /**
     * 根据用户id查找时间段内所有评论
     */
    List<Comment> findCommentByDatetimeRangeAndUserId(@Param("start") Date start, @Param("end") Date end, @Param("userId") Integer id);

    /**
     * 根据文章id查找文章下所有评论
     */
    List<Comment> findCommentByArticleId(@Param("id") Integer id);

    /**
     * 根据文章id查找文章下时间段内所有评论
     */
    List<Comment> findCommentByDatetimeRangeAndArticleId(@Param("start") Date start, @Param("end") Date end, @Param("articleId") Integer id);

    /**
     * 根据用户id,文章id查找其所有评论
     */
    List<Comment> findCommentByUserIdAndArticleId(@Param("userId") Integer userId, @Param("articleId") Integer articleId);

    /**
     * 根据用户id,文章id查找时间段内所有评论
     */
    List<Comment> findCommentByDatetimeRangeAndUserIdAndArticleId(@Param("start") Date start, @Param("end") Date end, @Param("userId") Integer userId, @Param("articleId") Integer articleId);

    /**
     * 查找所有评论
     */
    List<Comment> findAllComment();

    /**
     * 查找时间段内所有评论
     */
    List<Comment> findCommentByDatetimeRange(@Param("start") Date start, @Param("end") Date end);

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
