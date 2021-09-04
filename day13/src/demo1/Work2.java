package demo1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        //定义一个方法，判断输入的两个时间相差多少天
         //考点：通过日历类获取到当前时间的时间戳，最终两个时间戳相差
        Calendar calendar=Calendar.getInstance();
        System.out.println("请输入第一个时间（例如2000-11-11）：");
        Scanner scanner=new Scanner(System.in);
       // calendar.set
    }
    public String formatData(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

}
