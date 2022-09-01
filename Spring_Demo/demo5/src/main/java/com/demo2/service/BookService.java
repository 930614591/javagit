package com.demo2.service;

import com.demo2.Dao.BookDao;

public interface BookService {

    String all();
    void setBookDao(BookDao bookDao);
}
