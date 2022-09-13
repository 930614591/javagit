package com.ang.controller;

import com.ang.dom.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/data")
public class datapost {
    //普通参数
    @RequestMapping("/user")
    @ResponseBody
    public String commomParam(String name,int age){
        System.out.println(name+" "+age);
        return name+" "+age;
    }

    //普通参数、但是名字不对
    @RequestMapping("/user2")
    @ResponseBody
    public String commomParamDifferentName(@RequestParam("name")String username,int age){
        System.out.println(username+age);
        return username + " "+age;
    }

    //pojo参数
    @RequestMapping("/pojo")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println(user);
        return user.toString();
    }

    //数组参数
    @RequestMapping("/array")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println(Arrays.toString(likes));
        return Arrays.toString(likes);
    }

    //集合参数
    @RequestMapping("/list")
    @ResponseBody
    public String listParam(@RequestParam("likes") List<String> likes){
        System.out.println(likes);
        return likes.toString();
    }
}
