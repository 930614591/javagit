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
public class applog {
    static Logger logger= LoggerFactory.getLogger("自定义日志名.test.applog");//名字同时代表了级别
    static Logger logger2= LoggerFactory.getLogger("自定义日志名.test");//名字同时代表了级别，父记录器

    public static void main(String[] args) {

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
