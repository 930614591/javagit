package com.li.dome2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.创建当前日期对象
		Date date=new Date();
		System.out.println(date);
		
		//2.日期格式化工具
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		String timeString =simpleDateFormat.format(date);
		System.out.println(timeString);
		
		//将字符串转化成日期格式
		String time2="2008/12/12 12:12:12";
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		try {
			System.out.println(sdf2.parse(time2));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("日期解析错误");
			e.printStackTrace();
		}
		
	}

}
