package com.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet("/cookie")
public class setcookie extends HttpServlet   {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建并发送cookie

        //创建cookie对象
        Cookie cookie = new Cookie("username", "zhangsan");

        //cookie无法存储中文，推荐将字符串转码后存储
        String vl="张三";
        vl = URLEncoder.encode(vl, "UTF-8");
        //解码
        // URLDecoder.decode(vl, "UTF-8");
        Cookie cookie2 = new Cookie("password", vl);

        //设置cookie存活时间 秒数正数表示时间 负数表示关闭浏览器自动删除，零删除cookie
        cookie.setMaxAge(7*24*60*60);
        cookie2.setMaxAge(7*24*60*60);

        //发送cookie
        resp.addCookie(cookie);
        resp.addCookie(cookie2);
    }
}
