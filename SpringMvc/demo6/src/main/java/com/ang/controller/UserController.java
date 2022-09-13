package com.ang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//定义@Controller
//2.1使用Controller定义bean
@Controller
@RequestMapping("/user")//设定请求路径的前缀
public class UserController {
    //2.2设定访问路径
    //2.3设置当前操作的返回值类型
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("save");
        return "{'module':'springmvc'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("delete");
        return "{'module':'springmvc delete'}";
    }
}
