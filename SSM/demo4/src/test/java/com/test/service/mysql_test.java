package com.test.service;

import com.li.config.SpringConfig;
import com.li.dao.BookDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class mysql_test {
    @Autowired
    private BookDao bookDao;
    @Test
    public void test() {

        bookDao.getAll();
    }
}
