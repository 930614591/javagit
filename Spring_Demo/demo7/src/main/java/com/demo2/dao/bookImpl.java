package com.demo2.dao;

import org.springframework.stereotype.Repository;

@Repository
public class bookImpl implements book{
    @Override
    public void save() {
        System.out.println("book");
    }
}
