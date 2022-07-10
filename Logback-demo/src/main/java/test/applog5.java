package test;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
* 创建测试类

test.applog.java

创建一个记录器

用记录器生成日志
* */
public class applog5 {



    public static void main(String[] args) {
        ch.qos.logback.classic.Logger logger= (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.aa");//名字同时代表了级别

        System.out.println("com.aa级别");
        System.out.println(logger.getLevel());
        System.out.println(logger.getEffectiveLevel());
        ch.qos.logback.classic.Logger logger2= (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com");//名字同时代表了级别
        System.out.println("com的级别");
        System.out.println(logger2.getLevel());
        System.out.println(logger2.getEffectiveLevel());

        /*
         * 成功将日志输出到了控制台，因为我们没有做相关的配置，所以只能将debug及以上的日志输出到控制台（日志分为五个等级）
         * 日志的五个等级
         * TRACE < DEBUG < INFO < WARN <ERROR
         * */
    }
}
