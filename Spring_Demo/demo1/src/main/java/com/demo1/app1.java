package com.demo1;

import com.demo1.Dao.BookDao;
import com.demo1.Dao.BookDaoImpl;
import com.demo1.service.BookService;
import com.demo1.service.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app1 {
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();
        bookDao.select();
        BookService bookService = new BookServiceImpl();
        bookService.all();
    }
}
