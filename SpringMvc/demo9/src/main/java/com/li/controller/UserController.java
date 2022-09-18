package com.li.controller;

import com.li.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {


    //响应文本数据
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("/save");
        return "{'module':'save'}";
    }

    //响应文本数据
    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("/delete");
        return "{'module':'delete "+id+"'}";
    }
    //响应文本数据
    @RequestMapping(value = "/users/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@PathVariable Integer id){
        System.out.println("/update");
        return "{'module':'update "+id+"'}";
    }
    //响应文本数据
    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getbyid(@PathVariable Integer id){//此注解表示变量来自请求路径
        System.out.println("/getbyid");
        return "{'module':'getbyid "+id+"'}";
    }

    //响应文本数据
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public String selectall(){//此注解表示变量来自请求路径
        System.out.println("/selectall");
        return "{'module':'selectall '}";
    }
}
