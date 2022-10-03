package com.li.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//本类需要被扫描到 （mvc配置）
//1声明用来Rest风格异常处理
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //用来处理程序错误,声明异常处理标志，拦截异常标志,并在参数里设置拦截类型
    @ExceptionHandler(Exception.class)
    public Result doExceptionHandler(Exception e) {
        System.out.println("异常1");
        return new Result(666 ,null,"出错了");
    }
}
