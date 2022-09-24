package com.li.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.li.service"})
//加载资源文件，数据
@PropertySource({"classpath:jdbc.properties"})
@Import({JdbcConfig.class, MyaBtisConfig.class})
@EnableTransactionManagement //开启事务
public class SpringConfig {
}
