package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  //注册为控制器bean
@RequestMapping(value = "/blog")    //请求路径
public class UserController {

    @ResponseBody  //返回json数据
    @RequestMapping(value="/hello")
    public String hello(){
        System.out.println();
        return "hello";
    }
}
