package com.ang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
