package com.blog.dao;

import com.blog.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author darren
 * TODO:完善用户数查询限制
 */
@Repository
public interface UserDao {
    /**
     * 根据用户名查找用户
     */
    User findUserByUsername(@Param("name") String name);

    /**
     * 根据用户id查找用户
     */
    User findUserById(@Param("id") int id);

    /**
     * 查找所有用户
     */
    List<User> findAllUser();

    /**
     * 修改用户
     */
    void updateUser(@Param("user") User user);

    /**
     * 删除用户
     */
    void deleteUser(@Param("userId") int userId);

    /**
     * 注册新用户
     */
    void saveUser(@Param("user") User user);
}
