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

    List<User> findByCustom(User user);

    /**
     * 根据用户名查找用户
     */
    User findUserByUsername(@Param("name") String name);

    /**
     * 根据用户id查找用户
     */
    User findUserById(@Param("id") Integer id);

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
    void deleteUser(Integer userId);

    /**
     * 注册新用户
     */
    void saveUser(User user);
}
