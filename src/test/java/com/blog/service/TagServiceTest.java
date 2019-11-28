package com.blog.service;

import com.blog.entity.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:spring-beans.xml") //设置spring配置文件路径
public class TagServiceTest {

    @Autowired
    private TagService tagService;

    @Test
    public void findTag() {
        System.out.println(tagService.findTag("tag1"));
    }

    @Test
    public void findTagById() {
        System.out.println(tagService.findTagById(1));
    }

    @Test
    public void findAllTag() {
        System.out.println(tagService.findAllTag());
    }

    @Test
    public void editTag() {
        Tag tag = tagService.findTagById(5);
        tag.setName("edit");
        tagService.editTag(tag);
    }

    @Test
    public void deleteTag() {
        tagService.deleteTag(4);
    }

    @Test
    public void newTag() {
        Tag tag = new Tag();
        tag.setName("save");
        tagService.newTag(tag);
    }
}