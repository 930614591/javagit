package com.li.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.li.controller","com.li.config"})
@EnableWebMvc
public class SpringMvcConfig {

}
