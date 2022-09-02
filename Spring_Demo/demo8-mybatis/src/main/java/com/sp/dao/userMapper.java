package com.sp.dao;

import com.sp.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface userMapper {
    @Select("select * from user")
    List<User> selectall();


    //User selectid(int user_id);
}
