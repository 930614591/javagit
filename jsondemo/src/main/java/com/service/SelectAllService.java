package com.service;

import com.Utilql.sqlsessionFactoryUtils;
import com.mapper.UserMapper;
import com.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class SelectAllService {
    //封装方法，以供查询，返回user结果列表给调用者

    public List<User> selectall() {
        //调用MyBatis完成查询
        //1.加载核心配置，获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory= sqlsessionFactoryUtils.getSqlsessionFactory();
        //2.获取sqlsiooin
        SqlSession sqlSession=sqlSessionFactory.openSession();
//        2.3获取Mapper
        UserMapper usermapper =sqlSession.getMapper(UserMapper.class);
//        2.4调用方法
        List<User> users = usermapper.SelectAllUser();
        sqlSession.close();
        return users;
    }
}
