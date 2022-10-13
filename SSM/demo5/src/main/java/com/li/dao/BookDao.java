package com.li.dao;

import com.li.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    //    @Insert("Insert into book (type,name,descrption) valus(#{tpye},#{name},#{descrption})")
    @Insert("Insert into book values(null,#{type},#{name},#{description})")
    public void save(Book book);

    @Update("update book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    public void update(Book book);

    @Delete("delete from book where id=#{id}")
    public void delete(Integer id);

    @Select("select * from book where id=#{id}")
    public Book getById(Integer id);

    @Select("select * from book")
    public List<Book> getAll();
}
