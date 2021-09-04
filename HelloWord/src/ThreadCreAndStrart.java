//线程的创建和启动
public class ThreadCreAndStrart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = new RunnableThread();	//创建并初始化RunnableThread对象
		Thread rThread=new Thread(runnable);		//创建并初始化线程对象rThread
		
		
		SubThread sThread=new SubThread();          //创建并初始化SubThread对象
		//设置线程的优先级
//		sThread.setPriority(1);
//		rThread.setPriority(2);
//		sThread.start();//启动线程
//		rThread.start();//启动线程
		sThread.setPriority(2);
		rThread.setPriority(1);
		rThread.start();//启动线程
		sThread.start();//启动线程

	}
	//重写run方法
	public static class RunnableThread implements Runnable{
		public void run() {
			System.out.println("RunnableThread创建并启动成功");
		}
	}
	static class SubThread extends Thread{
		public SubThread() {}			//声明并实现SubThread的构造方法
		
		//声明并实现带参数的SubThread构造方法
		public SubThread(String nameString) {
			super(nameString);			//调用父类的构造方法
		}
		//重写run方法
		public void run() {
			System.out.println("SubThread创建并启动成功");
		}
		
	}
	
	

}
