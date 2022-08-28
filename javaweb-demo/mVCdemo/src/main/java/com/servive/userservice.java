package com.servive;

import com.mapper.usermapper;
import com.pojo.user;
import com.util.SqlSessionfactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/*
* 查询所有的功能
* */

public class userservice {

    //调用brandMapper。selectAll（）
    SqlSessionFactory sqlSessionFactory = SqlSessionfactoryUtils.getSqlSessionFactory();
//    查询所有
    public List<user> selectall(){

        //获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取usermapper
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        //调用方法
        List<user> users=mapper.selectAll();
        sqlSession.close();
        return users;
    }

//    添加

    public void adduser(user user){
        //获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取usermapper
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        //调用方法
        mapper.add(user);
        sqlSession.commit();
        sqlSession.close();
    }


    //通过id查询用户
    public user selectid(Integer id){
        //获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取usermapper
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        //调用方法
        user user=mapper.selectID(id);
        sqlSession.close();
        return user;
    }

//    修改数据
    public void updateuser(user user){
        //获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取usermapper
        usermapper mapper = sqlSession.getMapper(usermapper.class);
        //调用方法
        try {
            mapper.update(user);
            sqlSession.commit();

        }catch (Exception e) {
            System.out.println("更新数据出错了！");
        }
        sqlSession.close();

    }
}

