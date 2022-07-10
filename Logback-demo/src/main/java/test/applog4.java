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
public class applog4 {



    public static void main(String[] args) {

        ch.qos.logback.classic.Logger rootLogger=(ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);//获取Root根记录器
        rootLogger.setLevel(Level.INFO);
        System.out.println("设置之前的级别");
        System.out.println(rootLogger.getLevel());
        System.out.println(rootLogger.getEffectiveLevel());
        rootLogger.setLevel(Level.WARN);
        System.out.println("设置之后的级别");
        System.out.println(rootLogger.getLevel());
        System.out.println(rootLogger.getEffectiveLevel());
        rootLogger.trace("no0");
        rootLogger.debug("no1");
        rootLogger.info("no2");
        rootLogger.warn("no3");
        rootLogger.error("no4");
        /*
        * 成功将日志输出到了控制台，因为我们没有做相关的配置，所以只能将debug及以上的日志输出到控制台（日志分为五个等级）
        * 日志的五个等级
        * TRACE < DEBUG < INFO < WARN <ERROR
        * */
    }
}
