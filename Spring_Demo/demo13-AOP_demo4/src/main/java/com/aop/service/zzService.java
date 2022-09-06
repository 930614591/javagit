package com.aop.service;

import com.aop.pojo.YH;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface zzService {
    public YH selectbyid(int id);
    @Transactional//开启事务
    public void update(int out,int in,int money);
}
