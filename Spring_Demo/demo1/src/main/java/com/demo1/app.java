package com.demo1;

import com.demo1.Dao.BookDao;
import com.demo1.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
//        获取ioc容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContest.xml");
        //获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.select();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.all();
    }
}
