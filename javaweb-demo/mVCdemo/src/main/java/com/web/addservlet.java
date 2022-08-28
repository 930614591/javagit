package com.web;

import com.pojo.user;
import com.servive.userservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/addservlet")
public class addservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理post乱码
        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        user user=new user();
        user.setUsername(username);
        user.setPassword(password);
        userservice userservice = new userservice();
        try {
            userservice.adduser(user);

            req.getRequestDispatcher("/selectAllServlet").forward(req,resp);
        }catch (Exception e) {

            e.printStackTrace();

        }

    }
}
