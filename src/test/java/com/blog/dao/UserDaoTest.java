package com.blog.dao;

import com.blog.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:spring-beans.xml") //设置spring配置文件路径
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void findUserByUsername() {
        System.out.println(userDao.findUserByUsername("Tester"));
    }

    @Test
    public void findUserById() {
        System.out.println(userDao.findUserById(0));
    }

    @Test
    public void findAllUser() {
        System.out.println(userDao.findAllUser());
    }

    @Test
    public void updateUser() {
        int id = 2;
        System.out.println(userDao.findUserById(id));
        User user = userDao.findUserById(id);
        user.setUsername("update");
        userDao.updateUser(user);
        System.out.println(userDao.findUserById(id));
    }

    @Test
    public void deleteUser() {
        userDao.deleteUser(8);
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setUsername("newUser");
        user.setGrant("visitor");
        user.setPassword("qwer");
        userDao.saveUser(user);
    }
}