package com.ang.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

//定义一个servlet容器启动配置类，加载spring的配置
//    public class ServletConfig extends AbstractDispatcherServletInitializer {
//        //加载springMVC容器配置
//        @Override
//        protected WebApplicationContext createServletApplicationContext() {
//            AnnotationConfigWebApplicationContext web=new AnnotationConfigWebApplicationContext();
//            web.register(SpringMvcConfig.class);
//            return web;
//        }
//        //设置那些请求归属SpringMVC处理
//        @Override
//        protected String[] getServletMappings() {
//            return new String[]{"/"};
//        }
//    //加载Spring容器配置
//        @Override
//        protected WebApplicationContext createRootApplicationContext() {
//            AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
////            web.register(SpringConfig.class);
////            return ctx;
//        }
//    }
    public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[]{SpringMvcConfig.class};
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[]{SpringConfig.class};
        }

        @Override
        protected String[] getServletMappings() {
            return new String[]{"/"};
        }

        //乱码处理，设定过滤器

    @Override
    protected Filter[] getServletFilters() {
            //设定过滤器
        //
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
