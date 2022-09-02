package com.sp.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

//自定义mybatis返回sqlseeson
public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        //获取sqlSessionFactory
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        //实体类
        sqlSessionFactoryBean.setTypeAliasesPackage("com.sp.pojo");

        //将自定义的jdbc配置文件以bean形式加载
        sqlSessionFactoryBean.setDataSource(dataSource);


        //返回SqlSessionFactory
        return sqlSessionFactoryBean;
    }

    //定义映射文件位置
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //数据查询映射文件
        mapperScannerConfigurer.setBasePackage("com.sp.dao");
        return mapperScannerConfigurer;
    }
}



/*
<configuration>
<properties resource="jdbc.properties"/>
<environments default="development">
<environment id="development">
<transactionManager type="JDBC"/>
<dataSource type="POOLED">
<property name="driver" value="${jdbc.driver}"/>
<property name="url" value="${jdbc.url}"/>
<property name="username" value="${jdbc.username}"/>
<property name="password" value="${jdbc.password}"/>
</dataSource>
</environment>
</environments>
<mappers>
<mapper resource="com.sp"/>
</mappers>
</configuration>
*/
