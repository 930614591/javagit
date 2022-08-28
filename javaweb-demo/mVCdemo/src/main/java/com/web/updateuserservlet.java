package com.web;

import com.pojo.user;
import com.servive.userservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateuser")
public class updateuserservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userservice userservice = new userservice();
        //调用userservice完成更新
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        user user = new user();
        user.setId(Integer.parseInt(id));
        user.setUsername(username);
        user.setPassword(password);
        try {
            userservice.updateuser(user);
            //通过id查询
            //转发到查询界面
            req.getRequestDispatcher("/selectid").forward(req,resp);
        }catch (Exception e) {

        }




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
