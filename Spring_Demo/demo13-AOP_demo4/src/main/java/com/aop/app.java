package com.aop;

import com.aop.config.SpringConfig;
import com.aop.pojo.YH;
import com.aop.service.zzService;
import com.aop.service.zzServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        zzService zz = ctx.getBean(zzService.class);
        System.out.println(zz.selectbyid(1));
        System.out.println(zz.selectbyid(2));
        zz.update(2,1,1000);
        System.out.println(zz.selectbyid(1));
        System.out.println(zz.selectbyid(2));
    }
}
