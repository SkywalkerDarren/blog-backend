package com.blog.service;

import com.blog.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:spring-beans.xml") //设置spring配置文件路径
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findUserByUsername() {
        System.out.println(userService.findUserByUsername("user2"));
    }

    @Test
    public void findUserById() {
        System.out.println(userService.findUserById(1));
    }

    @Test
    public void findAllUser() {
        System.out.println(userService.findAllUser());
    }

    @Test
    public void updateUser() {
        User user = userService.findUserById(13);
        user.setPassword("update");
        userService.updateUser(user);
    }

    @Test
    public void deleteUser() {
        userService.deleteUser(100);
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setUsername("save2");
        user.setPassword("save");
        userService.saveUser(user);
    }
}