package com.aop;

import com.aop.config.SpringConfig;
import com.aop.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService.selectid(3));
        System.out.println(bookService.selectall());
    }
}
