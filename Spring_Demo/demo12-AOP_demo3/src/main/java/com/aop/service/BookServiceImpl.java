package com.aop.service;

import com.aop.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private com.aop.dao.userMapper userMapper;
    @Override
    public List<User> selectall() {
        return userMapper.selectall();
    }

    @Override
    public User selectid(int id) {
        return userMapper.select(id);
    }
}
