package com.li.dome2;

import java.util.Calendar;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1、时间戳 (从1970.1.1 0：0：0到现在的毫秒数)
		long time=System.currentTimeMillis();
		System.out.println(time/1000/60/60/24/365);
		//可以检测程序耗费时间
		
		//Date date=new Date(2021, 8, 8);//此方法已过时。但是可以使用
		//Date date1=new Date();
		//System.out.println(date);
		
		//2.日历类
		Calendar calendar= Calendar.getInstance();
		calendar.set(2018, 11, 18, 17, 53, 53);
		System.out.println();//向日历中设置时间
		Date time2=calendar.getTime();//将日历中设置的时间返回
		System.out.println(time2);
		

	}

}
