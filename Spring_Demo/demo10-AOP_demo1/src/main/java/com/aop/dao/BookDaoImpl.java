package com.aop.dao;

import org.springframework.stereotype.Service;

@Service
public class BookDaoImpl implements BookDao{
    @Override
    public void add() {
        System.out.println("BookDao add");
    }

    @Override
    public void remove() {
        System.out.println("Book Dao remove");
    }
}
