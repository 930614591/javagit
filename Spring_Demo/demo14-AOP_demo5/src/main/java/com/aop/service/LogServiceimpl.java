package com.aop.service;

import com.aop.dao.LogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogServiceimpl implements LogService {
    @Autowired
    private LogDao logDao;

    @Override
    public void log(int out, int in, int money) {
        logDao.log("转账由"+out+"到"+in+"金额"+money);
    }
}
