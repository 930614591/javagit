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
@WebServlet("/selectid")
public class selectidservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userservice userservice = new userservice();
        //调用userservice完成查询
        String id = req.getParameter("id");
        user user = userservice.selectid(Integer.parseInt(id));
        //存入Request域中
        req.setAttribute("user",user);

        //转发到user.jsp
        req.getRequestDispatcher("/update.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
