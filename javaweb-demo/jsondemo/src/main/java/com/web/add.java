package com.web;

import com.alibaba.fastjson.JSON;
import com.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
@WebServlet("/add")
public class add extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //前端发过来的post数据需要从请求体里拿出来
        BufferedReader reader = req.getReader();
        //从缓冲区读取一行，post只有一行
        String s = reader.readLine();

        //将json转换成对象
        User userobject = JSON.parseObject(s, User.class);

        //将查询到的对象转换成json 序列化
        String usersJson = JSON.toJSONString(userobject);
        System.out.println(userobject);
        System.out.println(s);
        resp.getWriter().write(usersJson);

    }
}
