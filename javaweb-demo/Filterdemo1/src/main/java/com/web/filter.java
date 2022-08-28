package com.web;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")//拦截所有
public class filter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //放行前逻辑
        System.out.println("1 Filter demo");
        //放行前会对Request进行处理，携带到资源里去

        //放行
        filterChain.doFilter(servletRequest,servletResponse);

        //放行后逻辑
        System.out.println("1 Filter demo");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    @Override
    public void destroy() {

    }
}
