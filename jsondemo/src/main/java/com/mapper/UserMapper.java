package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from tb_user")
    public List<User>  SelectAllUser();
}
