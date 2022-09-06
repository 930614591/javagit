package com.aop.service;

import com.aop.dao.yh;
import com.aop.pojo.YH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class zzServiceImpl implements zzService{
    @Autowired
    private yh yh;
    @Override
    public YH selectbyid(int id) {
        YH zh = yh.selectid(id);
        return zh;
    }

    @Override
    public void update(int out,int in,int money) {
        yh.outzz(out,money);
        //int i=1/0;
        yh.inzz(in,money);
    }
}
