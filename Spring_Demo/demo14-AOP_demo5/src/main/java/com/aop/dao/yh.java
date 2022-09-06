package com.aop.dao;

import com.aop.pojo.YH;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface yh {
    @Select("select * from yh where id=#{id}")
    public YH selectid(int id);

    @Update("update yh set money=money+#{money} where id=#{id}")
    public void inzz(@Param("id") int id,@Param("money") int money);

    @Update("update yh set money=money-#{money} where id=#{id}")
    public void outzz(@Param("id") int id,@Param("money") int money);
}
