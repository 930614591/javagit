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
public class applog3 {



    public static void main(String[] args) {
        ch.qos.logback.classic.Logger logger= (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("自定义日志名");//名字同时代表了级别
        ch.qos.logback.classic.Logger rootLogger=(ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);//获取Root根记录器
        rootLogger.setLevel(Level.INFO);
        System.out.println("设置之前的级别");
        System.out.println(logger.getLevel());
        System.out.println(logger.getEffectiveLevel());
        logger.setLevel(Level.INFO);
        System.out.println("设置之后的级别");
        System.out.println(logger.getLevel());
        System.out.println(logger.getEffectiveLevel());
        logger.trace("no0");
        logger.debug("no1");
        logger.info("no2");
        logger.warn("no3");
        logger.error("no4");
        /*
        * 成功将日志输出到了控制台，因为我们没有做相关的配置，所以只能将debug及以上的日志输出到控制台（日志分为五个等级）
        * 日志的五个等级
        * TRACE < DEBUG < INFO < WARN <ERROR
        * */
    }
}
