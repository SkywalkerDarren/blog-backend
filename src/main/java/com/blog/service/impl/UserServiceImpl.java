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
        User oldUser;
        if (user.getId() != null) {
            oldUser = userDao.findUserById(user.getId());
            if (oldUser == null) {
                throw new RuntimeException("无id");
            }
            if (user.getUsername() == null) {
                user.setUsername(oldUser.getUsername());
            }
        } else if (user.getUsername() != null){
            oldUser = userDao.findUserByUsername(user.getUsername());
            if (oldUser == null) {
                throw new RuntimeException("无用户名");
            }
            user.setId(oldUser.getId());
        } else {
            throw new RuntimeException("无id 用户名");
        }
        if (user.getGrant() == null) {
            user.setGrant(oldUser.getGrant());
        }
        if (user.getPassword() == null) {
            user.setPassword(oldUser.getPassword());
        }
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }

    @Override
    public void saveUser(User user) {
        if (user.getGrant() == null) {
            user.setGrant("visitor");
        }
        userDao.saveUser(user);
    }
}
