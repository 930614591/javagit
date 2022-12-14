package com.Utilql;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class sqlsessionFactoryUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        //静态代码块会随着类的加载自动执行，并且只会执行一次
        try {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;

        inputStream = Resources.getResourceAsStream(resource);

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlsessionFactory(){
        return sqlSessionFactory;
    }
}
