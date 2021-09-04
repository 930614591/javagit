
public class ThreadAsynchronous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShareData oShareData=new ShareData();//创建并初始化oShare
		ThreaDome2 th1Dome2=new ThreaDome2("Thread1", oShareData);
		ThreaDome2 th2Dome2=new ThreaDome2("Thread2", oShareData);//创建线程
		//th1Dome2.setPriority(2);
		//th2Dome2.setPriority(1);
		th1Dome2.start();
		th2Dome2.start();
		
	}
	
	//定义类ShareDatal
	static class ShareData{
		public String szdata="";//声明并初始化字符串数据域
	}
	
	
	static class ThreaDome2 extends Thread{
		
		//定义类ThreaDome2
		private ShareData oShare;//声明并初始化ShreadDatal数据域
		ThreaDome2() {
			// TODO Auto-generated method stub
			//声明并实现ThreadDome2带参数的构造方法
		}
		
		ThreaDome2(String szNameString,ShareData oShareData) {
			super(szNameString);
			this.oShare=oShareData;
			
		}
		
		public void run() {
			
			for(int i=0; i<5; i++) {
				if(this.getName().equals("Thread1")) {
					oShare.szdata="这是第1个线程";
					//为了演示问题的出现，这里设施一次休眠
					try {
						Thread.sleep((int)Math.random()*100);//sh设置线程休眠
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						//buhuo捕获线程异常
					}
					System.out.println(this.getName()+":"+oShare.szdata);//输出字符串信息
				}else if (this.getName().equals("Thread2")) {
					oShare.szdata="这是第2个线程";
					try {
						Thread.sleep((int)Math.random()*100);//sh设置线程休眠
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						//buhuo捕获线程异常
					
					}
					System.out.println(this.getName()+":"+oShare.szdata);//输出字符串信息
				}
			}
		}
	}

}
