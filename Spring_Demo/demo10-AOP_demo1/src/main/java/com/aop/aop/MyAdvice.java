package com.aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
//添加为spring bean
//扫描本类下的方法
//接下来向配置里添加注解启用
@Component
@Aspect
public class MyAdvice {
    //设定需要增强的方法
    @Pointcut("execution(void com.aop.dao.BookDao.add())")
    private void pt(){}
    //定义切入点


    //获取当前时间，绑定给pt，绑定切入点和通知
    @Before("pt()")
    public void methob(){
        System.out.println(System.currentTimeMillis());
        //定义通知
    }
}
