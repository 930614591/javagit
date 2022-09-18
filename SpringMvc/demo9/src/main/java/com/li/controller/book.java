package com.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
//有下面的注解代替这俩
@RestController
@RequestMapping("/books")
public class book {


    //响应文本数据
    //@RequestMapping(method = RequestMethod.POST)
    @PatchMapping
    public String save(){
        System.out.println("/booksave");
        return "{'module':'booksave'}";
    }

    //响应文本数据
    //@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("/bookdelete");
        return "{'module':'bookdelete "+id+"'}";
    }
    //响应文本数据
//    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @PatchMapping("/{id}")
    public String update(@PathVariable Integer id){
        System.out.println("/bookupdate");
        return "{'module':'bookupdate "+id+"'}";
    }
    //响应文本数据
//    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getbyid(@PathVariable Integer id){//此注解表示变量来自请求路径
        System.out.println("/bookgetbyid");
        return "{'module':'bookgetbyid "+id+"'}";
    }

    //响应文本数据
//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String selectall(){//此注解表示变量来自请求路径
        System.out.println("/selectall");
        return "{'module':'selectall '}";
    }
}
