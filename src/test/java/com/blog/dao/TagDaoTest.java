package com.blog.dao;

import com.blog.entity.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:spring-beans.xml") //设置spring配置文件路径
public class TagDaoTest {

    @Autowired
    private TagDao tagDao;

    @Test
    public void findTag() {
        System.out.println(tagDao.findTag("tag1"));
    }

    @Test
    public void findTagById() {
        System.out.println(tagDao.findTagById(1));
    }

    @Test
    public void findAllTag() {
        System.out.println(tagDao.findAllTag());
    }

    @Test
    public void editTag() {
        Tag tag = tagDao.findTag("tag1");
        tag.setName("tag");
        tagDao.editTag(tag);
    }

    @Test
    public void deleteTag() {
        tagDao.deleteTag(6);
    }

    @Test
    public void newTag() {
        Tag tag = new Tag();
        tag.setName("new");
        tagDao.newTag(tag);
    }
}