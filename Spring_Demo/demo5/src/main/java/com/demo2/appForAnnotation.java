package com.demo2;

import com.demo2.config.SpringConfig;
import com.demo2.service.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class appForAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookServiceImpl bean = ctx.getBean(BookServiceImpl.class);
        bean.all();
    }
}
