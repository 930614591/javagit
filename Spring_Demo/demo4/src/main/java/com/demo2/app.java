package com.demo2;

import com.demo2.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
//        获取ioc容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContest.xml");
        //获取bean
        BookService bookService = ctx.getBean(BookService.class);
        bookService.all();
    }
}
