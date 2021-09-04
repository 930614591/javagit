import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class T1DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TestlohstDateTime(); 
	}
	public static void TestlohstDateTime() {
		//获取当前的日期时间
		LocalDateTime currenrTime=LocalDateTime.now();
		System.out.println("当前时间"+currenrTime);
		//获取当前日期
		LocalDate date0Date=LocalDate.now();
		System.out.println("当前时间"+date0Date);
		//获取年月时分秒
		Month month=currenrTime.getMonth();
		int day=currenrTime.getDayOfMonth();
		int seconds=currenrTime.getSecond();
		System.out.println("月："+month+",日："+day+",秒："+seconds);
		
		//设定时间
		LocalDateTime date2DateTime=currenrTime.withDayOfMonth(10).withYear(2012);
		System.out.println("设定时间"+date2DateTime);
		//设定日期
		LocalDate date3Date=LocalDate.of(2014, Month.DECEMBER, 12);
		System.out.println("设定时间"+date3Date);
		
		
	}

}
