package com.aop.dao;

import com.aop.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface userMapper {
    @Select("select * from user")
    List<User> selectall();

    @Select("select * from user where user_id=#{id}")
    public User select(int id);

    //User selectid(int user_id);
}
