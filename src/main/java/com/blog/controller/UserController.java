package com.blog.controller;

import com.blog.entity.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller  //注册为控制器bean
@RequestMapping(value = "/user")    //请求路径
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody  //返回json数据
    @RequestMapping(value = "/id/#{id}", method = RequestMethod.GET)
    public User findUserById(@PathVariable("id") String id){
        return userService.findUserById(Integer.parseInt(id));
    }

    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @ResponseBody
    @RequestMapping(value = "/name/#{username}", method = RequestMethod.GET)
    public User findUserByUsername(@PathVariable("username") String username) {
        return userService.findUserByUsername(username);
    }

    @RequestMapping(value = "/del/#{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void updateUser(User user) {
        userService.updateUser(user);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveUser(User user) {
        userService.saveUser(user);
    }
}
