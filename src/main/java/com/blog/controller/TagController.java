package com.blog.controller;

import com.blog.entity.Tag;
import com.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @ResponseBody
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public Tag findTag(@PathVariable("name") String name){
        return tagService.findTag(name);
    }

    @ResponseBody
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public Tag findTagById(@PathVariable("id") Integer id){
        return tagService.findTagById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Tag> findAllTag() {
        return tagService.findAllTag();
    }

    @ResponseBody
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public void editTag(@RequestBody Tag tag){
        tagService.editTag(tag);
    }

    @ResponseBody
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    public void deleteTag(@PathVariable("id") Integer id) {
        tagService.deleteTag(id);
    }

    @ResponseBody
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public void newTag(@RequestBody Tag tag) {
        tagService.newTag(tag);
    }
}
