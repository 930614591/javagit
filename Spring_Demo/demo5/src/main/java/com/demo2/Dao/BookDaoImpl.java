package com.demo2.Dao;

import org.springframework.stereotype.Component;

@Component
public class BookDaoImpl implements BookDao{
    @Override
    public String select() {
        System.out.println("bookdaoimpl");
        return null;
    }
}
