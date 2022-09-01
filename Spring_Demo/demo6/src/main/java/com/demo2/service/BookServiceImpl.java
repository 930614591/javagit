package com.demo2.service;

import com.demo2.Dao.BookDao;
import com.demo2.Dao.BookDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService{
//    BookDao bookDao=new BookDaoImpl();
//    删除业务层中使用new创建对象，使用set提供方法
@Autowired
    private BookDao bookDao;
@Value("${text.username}")
    private String name;
@Value("${text.id}")
    private Integer id;
    @Override
    public String all() {
        System.out.println("BookServiceImpl"+name+id);
        bookDao.select();
        return null;
    }

    @Override
    public void setBookDao(BookDao bookDao) {
        this.bookDao=bookDao;

    }
}
