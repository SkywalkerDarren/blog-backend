package com.blog.dao;

import com.blog.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author darren
 */
@Repository
public interface UserDao {
    /**
     * 根据用户名查找用户
     */
    User findUserByUsername(String name);

    /**
     * 根据用户id查找用户
     */
    User findUserById(int id);

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
    void deleteUser(int userId);

    /**
     * 注册新用户
     */
    void saveUser(User user);
}
