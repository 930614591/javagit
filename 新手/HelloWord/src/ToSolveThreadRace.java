	public class ToSolveThreadRace {

	static class ShareData{	
		public String szDataString="";//��������ʼ���ַ���������szData
	}
	static class ThreadDemo extends Thread{	
		private ShareData oShareData;//��������ʼ���ַ���������oShareData
		ThreadDemo(){}
		ThreadDemo(String szNameString,ShareData oShareData){
			super(szNameString);
			this.oShareData=oShareData;
		}
		public void run() {
			synchronized (oShareData) {//ָ��ͬ�����oShareData����
				for(int i=0;i<5;i++) {
					if(this.getName().equals("Thread1")) {
						//ִ���߳�thread1
						oShareData.szDataString="���ǵ�һ���߳�";
						//Ϊ����ʵ������������һ������
						try {
							Thread.sleep((int)Math.random()*50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//����ַ�����Ϣ
						System.out.println(this.getName()+":"+oShareData.szDataString);
					}else if (this.getName().equals("Thread2")){
						//ִ���߳�thread1
						oShareData.szDataString="���ǵڶ����߳�";
						//Ϊ����ʵ������������һ������
						try {
							Thread.sleep((int)Math.random()*50);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//����ַ�����Ϣ
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
