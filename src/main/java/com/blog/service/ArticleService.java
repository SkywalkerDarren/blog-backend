package com.blog.service;

import com.blog.entity.Article;

import java.util.Date;
import java.util.List;

public interface ArticleService {
    /**
     * 根据文章id查找文章
     */
    Article findArticleById(Integer id);

    /**
     * 根据标题模糊查找文章
     */
    List<Article> findArticleByTitle(String title);

    /**
     * 根据时间段查找文章
     */
    List<Article> findArticleByDatetimeRange(Date start, Date end);

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
    void deleteArticle(Integer id);

    /**
     * 新文章
     */
    void saveArticle(Article article);
}
