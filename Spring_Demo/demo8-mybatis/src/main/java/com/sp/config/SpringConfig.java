package com.sp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

//声明spring配置文件
@Configuration

//对包进行扫描，主要是寻找其他注解形式的bean
@ComponentScan("com.sp")

//引入第三方bean配置
@Import({jdbcconfig.class, MyBatisConfig.class})

//加载资源文件，数据
@PropertySource({"classpath:jdbc.properties"})
public class SpringConfig {
}
