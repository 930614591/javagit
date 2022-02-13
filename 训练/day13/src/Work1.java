import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Work1 {
    public static void main(String[] args) {
        //1 编写代码获取当前日期并格式化输出
//        System.out.println(new Work1().formatData(new Date()));
        //用日历实例对象
        Calendar calendar=Calendar.getInstance();
        calendar.set(2020,11,23,12,51,51);
        System.out.println(new Work1().formatData(calendar.getTime()));
    }

    public String formatData(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
