package com.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.aop")
//启动aop注解开发
@EnableAspectJAutoProxy
public class SpringConfig {
}
