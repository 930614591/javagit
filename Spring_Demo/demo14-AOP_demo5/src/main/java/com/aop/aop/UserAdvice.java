package com.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
//添加为spring bean
//扫描本类下的方法
//接下来向配置里添加注解启用
@Component
@Aspect
public class UserAdvice {
   /* //设定需要增强的方法
    @Pointcut("execution(* com.aop.service.*Service.*(..))")
    private void servicept(){}
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
    @Around("servicept()")
    public Object around(ProceedingJoinPoint p) throws Throwable {
        //执行时的签名信息，封装了运行时的方法
        Signature signature = p.getSignature();
        long start=System.currentTimeMillis();
        Object ret=null;
        for (int i = 0; i < 10000; i++) {
            ;//调用原方法，并抛出异常
            ret=p.proceed();
        }

        System.out.println(signature.getName()+"接口万次执行时间"+(System.currentTimeMillis()-start)/1000+"s");

        return ret;
    }

    //方法运行成功后的执行的方法
    //@AfterReturning("pt()")
    public void afterReturning(){
        System.out.println("原始方法运行成功后AfterReturning");
    }

    //抛出异常后才运行的
    //@AfterThrowing("pt()")
    public void afterThrowing(){
        System.out.println("抛出异常后才运行");
    }*/
}
