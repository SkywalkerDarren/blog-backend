package com.blog.controller;

import com.blog.entity.User;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller  //注册为控制器bean
@RequestMapping(value = "/user")    //请求路径
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody  //返回json数据
    @RequestMapping(value="/{id}}")
    public User findUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }

    @ResponseBody
    @RequestMapping("/all")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }
}
