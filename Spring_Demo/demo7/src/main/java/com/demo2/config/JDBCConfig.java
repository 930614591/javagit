package com.demo2.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.demo2.dao.book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JDBCConfig {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.userName}")
    private String userName;
    @Value("${jdbc.passWord}")
    private String passWord;

    //1.定义一个方法获得要管理的对象，推荐与对象同名
    //添加@bean注解表示当前方法的返回值是bean，可以添加名字也可以不添加
    //@Bean("dataSource")
    @Bean
    public DataSource dataSource(book book){//spring会自动寻找同类型的bean注入参数内
        System.out.println(book);
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(passWord);
        return ds;
    }
}
