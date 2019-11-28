package com.blog.service.impl;

import com.blog.dao.ArticleDao;
import com.blog.entity.Article;
import com.blog.service.ArticleService;
import com.blog.utils.CheckTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public Article findArticleById(Integer id) {
        return articleDao.findArticleById(id);
    }

    @Override
    public List<Article> findArticleByTitle(String title) {
        String like = "%" + title + "%";
        return articleDao.findArticleByTitle(like);
    }

    @Override
    public List<Article> findArticleByDatetimeRange(Date start, Date end) {
        CheckTool.checkDate(start, end);
        return articleDao.findArticleByDatetimeRange(start, end);
    }

    @Override
    public List<Article> findAllArticle() {
        return articleDao.findAllArticle();
    }

    @Override
    public void updateArticle(Article article) {
        articleDao.updateArticle(article);
    }

    @Override
    public void deleteArticle(Integer id) {
        articleDao.deleteArticle(id);
    }

    @Override
    public void saveArticle(Article article) {
        if (article.getDatetime() == null) {
            article.setDatetime(new Date());
        }
        articleDao.saveArticle(article);
    }
}
