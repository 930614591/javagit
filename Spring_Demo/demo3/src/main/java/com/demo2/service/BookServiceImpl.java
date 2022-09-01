package com.demo2.service;

import com.demo2.Dao.BookDao;
import com.demo2.Dao.BookDaoImpl;

public class BookServiceImpl implements BookService{
//    BookDao bookDao=new BookDaoImpl();
//    删除业务层中使用new创建对象，使用set提供方法
    private BookDao bookDao;

    @Override
    public String all() {
        System.out.println("BookServiceImpl");
        bookDao.select();
        return null;
    }

    @Override
    public void setBookDao(BookDao bookDao) {
        this.bookDao=bookDao;

    }
}
