package com.blog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:spring-beans.xml") //设置spring配置文件路径
public class TagServiceTest {

    @Test
    public void findTag() {
    }

    @Test
    public void findTagById() {
    }

    @Test
    public void findAllTag() {
    }

    @Test
    public void editTag() {
    }

    @Test
    public void deleteTag() {
    }

    @Test
    public void newTag() {
    }
}