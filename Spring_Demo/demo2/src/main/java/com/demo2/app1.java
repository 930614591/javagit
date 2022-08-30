package com.demo2;

import com.demo2.Dao.BookDao;
import com.demo2.Dao.BookDaoImpl;
import com.demo2.service.BookService;
import com.demo2.service.BookServiceImpl;

public class app1 {
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();
        bookDao.select();
        BookService bookService = new BookServiceImpl();
        bookService.all();
    }
}
