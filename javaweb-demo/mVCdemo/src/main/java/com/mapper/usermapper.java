package com.mapper;

import com.pojo.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface usermapper {
//    查询所有的用户
    @Select("select * from tb_user")
    List<user> selectAll();

    @Insert("insert into tb_user values(null,#{username},#{password})")
    void add(user user);

    @Select("select * from tb_user where id=#{id}")
    user selectID(int id);

    @Update("update tb_user set username=#{username},password=#{password} where id=#{id}")
    void update(user user);
}
