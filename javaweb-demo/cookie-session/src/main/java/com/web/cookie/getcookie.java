package com.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

@WebServlet("/getcookie")
public class getcookie extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = null;
        String password = null;
        //获取所有cookie
        Cookie[] cookies = req.getCookies();
        //遍历所有的cookie
        for (Cookie c : cookies) {
            //拿到每个cookie的数据 键值对
            if(c.getName().equals("username")){
                username= c.getValue();
            }
            if(c.getName().equals("password")){
                password= c.getValue();
            }


        }
        System.out.println(username+ URLDecoder.decode(password, "UTF-8"));

    }
}
