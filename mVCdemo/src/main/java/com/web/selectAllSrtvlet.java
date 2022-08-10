package com.web;

import com.pojo.user;
import com.servive.userservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
public class selectAllSrtvlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //调用userservice完成查询
        userservice ue = new userservice();
        List<user> users = ue.selectall();
        System.out.println(users);
        //存入Request域中
        req.setAttribute("users",users);

        //转发到user.jsp
        req.getRequestDispatcher("/user.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
