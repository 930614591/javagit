package com.ang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//3.创建spring配置文件，加载MVC对应bean
@Configuration
@ComponentScan("com.ang.controller")
@EnableWebMvc//开启json自动装换成对象的功能-等，功能非常多
public class SpringMvcConfig {
}
