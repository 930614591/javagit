package com.demo2.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.demo2")//对包进行扫描，获取此下所有bean
@Import({JDBCConfig.class})//加载引用文件，得到第三方bean
@PropertySource("text.properties")//加载数据文件
public class SpringConfig {


}
