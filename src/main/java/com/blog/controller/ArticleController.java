package com.blog.controller;

import com.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    //@ResponseBody
    //@RequestMapping(value = "/id/#{id}")
    //public Article findArticleById(@PathVariable("id") String id){
    //    return articleService.findArticleById(Integer.valueOf(id));
    //}

    //@ResponseBody
    //@RequestMapping(value = "/title/#{title}", method = RequestMethod.GET)
    //public List<Article> findArticleByTitle(@PathVariable("title") String title){
    //    return articleService.findArticleByTitle(title);
    //}
    //
    //@ResponseBody
    //@RequestMapping(value = "/date", method = RequestMethod.GET)
    //public List<Article> findArticleByDatetimeRange(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date start,
    //                                         @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date end){
    //    return articleService.findArticleByDatetimeRange(start, end);
    //}
    //
    //@ResponseBody
    //@RequestMapping(value = "/all", method = RequestMethod.GET)
    //public List<Article> findAllArticle(){
    //    return articleService.findAllArticle();
    //}
    //
    //@RequestMapping(value = "/update", method = RequestMethod.PUT)
    //public void updateArticle(@RequestBody Article article){
    //    articleService.updateArticle(article);
    //}
    //
    //@RequestMapping(value = "/del", method = RequestMethod.DELETE)
    //public void deleteArticle(Integer id){
    //    articleService.deleteArticle(id);
    //}
    //
    //@RequestMapping(value = "/save", method = RequestMethod.POST)
    //public void saveArticle(@RequestBody Article article){
    //    articleService.saveArticle(article);
    //}
}
