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
        return userDao.findUserByUsername(name);
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
