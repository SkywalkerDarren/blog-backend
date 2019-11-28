package com.blog.dao;

import com.blog.entity.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author darren
 * TODO:完善文章数查询限制
 */
@Repository
public interface ArticleDao {
    /**
     * 根据文章id查找文章
     */
    Article findArticleById(@Param("id") int id);

    /**
     * 根据标题模糊查找文章
     */
    List<Article> findArticleByTitle(@Param("title") String title);

    /**
     * 根据时间段查找文章
     */
    List<Article> findArticleByDatetimeRange(@Param("start") Date start, @Param("end") Date end);

    /**
     * 查找所有文章
     */
    List<Article> findAllArticle();

    /**
     * 编辑文章
     */
    void updateArticle(Article article);

    /**
     * 删除文章
     */
    void deleteArticle(int id);

    /**
     * 新文章
     */
    void saveArticle(Article article);
}
