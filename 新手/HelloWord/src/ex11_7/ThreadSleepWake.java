package ex11_7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleepWake  extends Thread{
	private DateFormat dateFormat=new SimpleDateFormat("ss:SS");
	
	//java程序主入口
	public static void main(String[] argsStrings) {
		
		//BasketballPersonManage mythread=new BasketballPersonManage();//主程序错误，
		
		
		
	}
	
	public void incident() {
		Thread.currentThread().interrupt();//唤醒当前线程
		while(true) {
			if(Thread.currentThread().isInterrupted()) {
				//判断当前线程是否被唤醒
				System.out.println(dateFormat.format(new Date())+"比赛开始现在是否准备上场");
				System.out.println(Thread.currentThread().isInterrupted()?"是":"没有");
				try {
					Thread.currentThread();
					Thread.sleep(5000);//		线程休眠5秒
				} catch (InterruptedException e) {//捕获唤醒异常
					System.out.println(dateFormat.format(new Date())+"收到主教练命令，停止休息！"+e.getMessage());
					// TODO: handle exception
				}
				System.out.println(dateFormat.format(new Date())+"本次比赛结束后，是否参加下一场比赛？");
				System.out.println(Thread.currentThread().isInterrupted()?"是":"不参加");
			}
		}
	}
	public void run() {
		System.out.println("第一场比赛结束的时间为："+dateFormat.format(new Date()));
		System.out.println("休息四小时");
		try {
			sleep(2000);//线程休眠2s假设1s是一小时
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(dateFormat.format(new Date())+"收到主教练命令，准备上场！"+e.getMessage());
		}
		System.out.println(dateFormat.format(new Date())+"在休息过程中是否又参加其他的比赛？");
		try {
			sleep(2000);//休眠两秒
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(dateFormat.format(new Date())+"收到主教练命令，准备上场！"+e.getMessage());
		}
		System.out.println(Thread.currentThread().isInterrupted()?"参加比赛":"没有参加比赛");
		interrupt();//唤醒线程
		System.out.println(dateFormat.format(new Date())+"休息中，替补队员受伤，是否参加比赛？");
		System.out.println(Thread.currentThread().isInterrupted()?"参加":"不参加");
	}
	
}
