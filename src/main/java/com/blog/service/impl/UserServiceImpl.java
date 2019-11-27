package com.blog.service.impl;

import com.blog.dao.UserDao;
import com.blog.entity.User;
import com.blog.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User findUserByUsername(String name) {
        return null;
    }

    @Override
    public User findUserById(int id) {
        return null;
    }

    @Override
    public List<User> findAllUser() {
        System.out.println("findAllUser");
        return userDao.findAllUser();
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public void saveUser(User user) {

    }
}
