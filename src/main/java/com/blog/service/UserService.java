package com.blog.service;

import com.blog.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 根据用户名查找用户
     */
    User findUserByUsername(String username);

    /**
     * 根据用户id查找用户
     */
    User findUserById(Integer id);

    /**
     * 查找所有用户
     */
    List<User> findAllUser();

    /**
     * 修改用户
     */
    void updateUser(User user);

    /**
     * 删除用户
     */
    void deleteUser(Integer id);

    /**
     * 注册新用户
     */
    void saveUser(User user);
}
