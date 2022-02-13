//Runnable接口实现多线程
public class CreThreadRunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable rbRunnable =new CreThreadRunnable();//创建实例
		Runnable rb1Runnable=new CreThreadRunnable();//创建实例
		Runnable rb2Runnable=new CreThreadRunnable();//创建实例
		Thread tdThread = new Thread(rbRunnable);//创建线程
		Thread td1Thread=new Thread(rb1Runnable);//创建线程
		Thread td2Thread=new Thread(rb2Runnable);//创建线程
		tdThread.start(); //运行线程
		td1Thread.start();//运行线程
		td2Thread.start();//运行线程
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//重载run方法
				for(int count=1,row=1;row<10;row++,count++) {
					for(int i=0;i<count;i++) {
						System.out.print("*");
					}
					System.out.println();
				}
	}

}
