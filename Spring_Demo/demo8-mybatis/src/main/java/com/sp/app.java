package com.sp;

import com.sp.config.SpringConfig;
import com.sp.service.selectallService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {
        //获取spring对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        //获取bean
        selectallService bean = ctx.getBean(selectallService.class);
        //执行bean
        bean.ase();
    }
}
