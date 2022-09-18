package com.li.controller;

import com.li.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    //响应页面，跳转页面
    @RequestMapping("/topage")
    public String topage(){
        System.out.println(">>>page.jsp");
        return "page.jsp";
    }

    //响应文本数据
    @RequestMapping("/totext")
    @ResponseBody
    public String totext(){
        System.out.println("/totext");
        return "totext";
    }

    //响应pojo对象
    @RequestMapping("/topojo")
    @ResponseBody
    public User topojo(){
        System.out.println("topojo");
        User user = new User();
        user.setName("zs");
        user.setAge(18);
        return user;
    }

    //响应pojo集合对象
    @RequestMapping("/topojolist")
    @ResponseBody
    public List<User> topojolist(){
        System.out.println("topojolist");
        User user = new User();
        user.setName("zs");
        user.setAge(18);
        User user2 = new User();
        user2.setName("zs");
        user2.setAge(18);
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        return users;
    }
}
