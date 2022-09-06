package com.aop.dao;

import org.apache.ibatis.annotations.Insert;

public interface LogDao {
    //INSERT INTO `ebook`.`log` (`info`, `date`) VALUES ('asasasa', '2022-09-06 23:10:44')
    @Insert("insert into log (`info`, `date`) values (#{log},NOW())")
    void log(String log);
}
