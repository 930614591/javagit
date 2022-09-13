package com.ang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//3.创建spring配置文件，加载MVC对应bean
@Configuration
@ComponentScan("com.ang.controller")
public class SpringMvcConfig {
}
