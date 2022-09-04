package com.aop.service;

import com.aop.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
    public List<User> selectall();
    public User selectid(int id);


}
