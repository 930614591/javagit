package com.sp.service;

import com.sp.dao.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class selectallService {
    //获取sqlsessonFactory
    @Autowired
    private userMapper userMapper;

    public void ase(){
        System.out.println(userMapper.selectall());
    }
}
