package com.blog.dao;

import com.blog.entity.Article;
import org.joda.time.DateTime;
import org.springframework.stereotype.Repository;

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
    Article findArticleById(int id);

    /**
     * 根据标题模糊查找文章
     */
    List<Article> findArticleByTitle(String title);

    /**
     * 根据时间段查找文章
     */
    List<Article> findArticleByDatetimeRange(DateTime start, DateTime end);

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
