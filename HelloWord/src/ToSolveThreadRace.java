	public class ToSolveThreadRace {

	static class ShareData{	
		public String szDataString="";//声明并初始化字符串数据域szData
	}
	static class ThreadDemo extends Thread{	
		private ShareData oShareData;//声明并初始化字符串数据域oShareData
		ThreadDemo(){}
		ThreadDemo(String szNameString,ShareData oShareData){
			super(szNameString);
			this.oShareData=oShareData;
		}
		public void run() {
			synchronized (oShareData) {//指定同步块给oShareData加锁
				for(int i=0;i<5;i++) {
					if(this.getName().equals("Thread1")) {
						//执行线程thread1
						oShareData.szDataString="这是第一个线程";
						//为了现实问题这里设置一个休眠
						try {
							Thread.sleep((int)Math.random()*50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//输出字符串信息
						System.out.println(this.getName()+":"+oShareData.szDataString);
					}else if (this.getName().equals("Thread2")){
						//执行线程thread1
						oShareData.szDataString="这是第二个线程";
						//为了现实问题这里设置一个休眠
						try {
							Thread.sleep((int)Math.random()*50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//输出字符串信息
						System.out.println(this.getName()+":"+oShareData.szDataString);
					}
				}
				
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShareData oShreData=new ShareData();
		ThreadDemo th1=new ThreadDemo("Thread1", oShreData);
		ThreadDemo th2=new ThreadDemo("Thread2", oShreData);
		th1.start();
		th2.start();
		
	}

}
