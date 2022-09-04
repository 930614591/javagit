package com.aop;

import com.aop.config.SpringConfig;
import com.aop.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookdao = ctx.getBean(BookDao.class);
        bookdao.add();
        bookdao.remove();
    }
}
