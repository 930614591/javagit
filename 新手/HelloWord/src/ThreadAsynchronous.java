
public class ThreadAsynchronous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShareData oShareData=new ShareData();//��������ʼ��oShare
		ThreaDome2 th1Dome2=new ThreaDome2("Thread1", oShareData);
		ThreaDome2 th2Dome2=new ThreaDome2("Thread2", oShareData);//�����߳�
		//th1Dome2.setPriority(2);
		//th2Dome2.setPriority(1);
		th1Dome2.start();
		th2Dome2.start();
		
	}
	
	//������ShareDatal
	static class ShareData{
		public String szdata="";//��������ʼ���ַ���������
	}
	
	
	static class ThreaDome2 extends Thread{
		
		//������ThreaDome2
		private ShareData oShare;//��������ʼ��ShreadDatal������
		ThreaDome2() {
			// TODO Auto-generated method stub
			//������ʵ��ThreadDome2�������Ĺ��췽��
		}
		
		ThreaDome2(String szNameString,ShareData oShareData) {
			super(szNameString);
			this.oShare=oShareData;
			
		}
		
		public void run() {
			
			for(int i=0; i<5; i++) {
				if(this.getName().equals("Thread1")) {
					oShare.szdata="���ǵ�1���߳�";
					//Ϊ����ʾ����ĳ��֣�������ʩһ������
					try {
						Thread.sleep((int)Math.random()*100);//sh�����߳�����
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						//buhuo�����߳��쳣
					}
					System.out.println(this.getName()+":"+oShare.szdata);//����ַ�����Ϣ
				}else if (this.getName().equals("Thread2")) {
					oShare.szdata="���ǵ�2���߳�";
					try {
						Thread.sleep((int)Math.random()*100);//sh�����߳�����
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						//buhuo�����߳��쳣
					
					}
					System.out.println(this.getName()+":"+oShare.szdata);//����ַ�����Ϣ
				}
			}
		}
	}

}
