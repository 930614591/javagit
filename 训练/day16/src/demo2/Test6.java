package demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
*
* 异常处理机制2
*   抛出异常：底层工具的色设计会抛出异常
*
* */
public class Test6 {
    public static void main(String[] args) throws ParseException {
        //方法签名（方法表+参数列表）throw ParseException 声明多个异常

        String str="2021-08-17";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        sdf.parse(str);
    }
}
