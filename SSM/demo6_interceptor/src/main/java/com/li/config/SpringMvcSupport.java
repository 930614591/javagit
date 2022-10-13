package com.li.config;

import com.li.controller.interceptor.Projectlnterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
//    @Autowired
//    private Projectlnterceptor projectlnterceptor;//自定有的拦截器类
//    //继承此类用于过滤静态资源
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
//
//    }
//    //用指定自定义拦截器的工作位置
//    @Override
//    protected void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(projectlnterceptor).addPathPatterns("/books","/books/*");
//    }
}
