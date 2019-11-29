package com.blog.controller;

import com.blog.entity.Comment;
import com.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @ResponseBody
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public Comment findCommentById(@PathVariable("id") Integer id) {
        return commentService.findCommentById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/content/{content}", method = RequestMethod.GET)
    public List<Comment> findComment(@PathVariable("content") String content) {
        return commentService.findComment(content);
    }

    @ResponseBody
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public List<Comment> findCommentByUserId(@PathVariable("id") Integer id) {
        return commentService.findCommentByUserId(id);
    }

    @ResponseBody
    @RequestMapping(value = "/user/{id}/date/{start}_{end}", method = RequestMethod.GET)
    public List<Comment> findCommentByDatetimeRangeAndUserId(@PathVariable("start") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date start,
                                                             @PathVariable("end") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date end,
                                                             @PathVariable("id") Integer id) {
        return commentService.findCommentByDatetimeRangeAndUserId(start, end, id);
    }

    @ResponseBody
    @RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
    public List<Comment> findCommentByArticleId(@PathVariable("id") Integer id) {
        return commentService.findCommentByArticleId(id);
    }

    @ResponseBody
    @RequestMapping(value = "/article/{id}/date/{start}_{end}", method = RequestMethod.GET)
    public List<Comment> findCommentByDatetimeRangeAndArticleId(@PathVariable("start") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date start,
                                                                @PathVariable("end") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date end,
                                                                @PathVariable("id") Integer id) {
        return commentService.findCommentByDatetimeRangeAndArticleId(start, end, id);
    }

    @ResponseBody
    @RequestMapping(value = "/user/{userId}/article/{articleId}", method = RequestMethod.GET)
    public List<Comment> findCommentByUserIdAndArticleId(@PathVariable("userId") Integer userId,
                                                         @PathVariable("articleId") Integer articleId) {
        return commentService.findCommentByUserIdAndArticleId(userId, articleId);
    }

    @ResponseBody
    @RequestMapping(value = "/user/{userId}/article/{articleId}/date/{start}_{end}", method = RequestMethod.GET)
    public List<Comment> findCommentByDatetimeRangeAndUserIdAndArticleId(
            @PathVariable("start") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date start,
            @PathVariable("end") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date end,
            @PathVariable("userId") Integer userId,
            @PathVariable("articleId") Integer articleId) {
        return commentService.findCommentByDatetimeRangeAndUserIdAndArticleId(start, end, userId, articleId);
    }

    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Comment> findAllComment() {
        return commentService.findAllComment();
    }

    @ResponseBody
    @RequestMapping(value = "/date/{start}_{end}", method = RequestMethod.GET)
    public List<Comment> findCommentByDatetimeRange(
            @PathVariable("start") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date start,
            @PathVariable("end") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date end) {
        return commentService.findCommentByDatetimeRange(start, end);
    }

    @ResponseBody
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public void editComment(@RequestBody Comment comment) {
        commentService.editComment(comment);
    }

    @ResponseBody
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    public void deleteComment(@PathVariable("id") String id) {
        commentService.deleteComment(Integer.valueOf(id));
    }

    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveComment(@RequestBody Comment comment) {
        commentService.saveComment(comment);
    }
}
