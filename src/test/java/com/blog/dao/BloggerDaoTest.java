package com.blog.dao;

import com.blog.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:spring-beans.xml") //设置spring配置文件路径
public class BloggerDaoTest {

    @Autowired
    private UserService userService;

    @Test
    public void testService() {
        System.out.println(userService.findAllUser());
    }
}