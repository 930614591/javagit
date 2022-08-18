package com.web;

import com.alibaba.fastjson.JSON;
import com.pojo.User;
import com.service.SelectAllService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAll")
public class SelectAllServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //调用service获取user集合
        SelectAllService selectall = new SelectAllService();
        List<User> users = selectall.selectall();

        //将查询到的对象转换成json 序列化
        String usersJson = JSON.toJSONString(users);
        //将数据写入响应
        resp.setContentType("text/json;charset=utf-8");//设置响应格式以及中文处理
        resp.getWriter().write(usersJson);
        System.out.println(usersJson);

    }
}
