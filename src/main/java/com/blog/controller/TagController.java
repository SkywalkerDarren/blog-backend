package com.blog.controller;

import com.blog.entity.Tag;
import com.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @ResponseBody
    @RequestMapping(value = "/name/#{name}", method = RequestMethod.GET)
    public Tag findTag(@PathVariable("name") String name){
        return tagService.findTag(name);
    }

    @ResponseBody
    @RequestMapping(value = "/id/#{id}", method = RequestMethod.GET)
    public Tag findTagById(@PathVariable("id") Integer id){
        return tagService.findTagById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Tag> findAllTag() {
        return tagService.findAllTag();
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public void editTag(Tag tag){
        tagService.editTag(tag);
    }

    @RequestMapping(value = "/del/#{id}", method = RequestMethod.DELETE)
    public void deleteTag(@PathVariable("id") Integer id) {
        tagService.deleteTag(id);
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public void newTag(Tag tag) {
        tagService.newTag(tag);
    }
}
