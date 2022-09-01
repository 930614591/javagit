package com.demo2.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class texttest {
    public static void main(String[] args) {
        //        获取ioc容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContest.xml");
        //获取bean
        text textbean = (text) ctx.getBean("textbean");
        textbean.save();
    }

}
