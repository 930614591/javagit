package com.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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


    //前置通知
    //@Before("pt()")
    public void before(){
        System.out.println("前置通知Befor");
        //定义通知
    }
    //后置通知
    //@After("pt()")
    public void after(){
        System.out.println("前置通知Befor");
        //定义通知
    }


    //环绕通知
    //@Around("pt()")
    public void around(ProceedingJoinPoint p) throws Throwable {
        System.out.println("环绕前");
        p.proceed();//调用原方法，并抛出异常
        System.out.println("环绕后");
    }

    //方法运行成功后的执行的方法
    //@AfterReturning("pt()")
    public void afterReturning(){
        System.out.println("原始方法运行成功后AfterReturning");
    }

    //抛出异常后才运行的
    @AfterThrowing("pt()")
    public void afterThrowing(){
        System.out.println("抛出异常后才运行");
    }
}
