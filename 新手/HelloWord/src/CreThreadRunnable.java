//Runnable�ӿ�ʵ�ֶ��߳�
public class CreThreadRunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable rbRunnable =new CreThreadRunnable();//����ʵ��
		Runnable rb1Runnable=new CreThreadRunnable();//����ʵ��
		Runnable rb2Runnable=new CreThreadRunnable();//����ʵ��
		Thread tdThread = new Thread(rbRunnable);//�����߳�
		Thread td1Thread=new Thread(rb1Runnable);//�����߳�
		Thread td2Thread=new Thread(rb2Runnable);//�����߳�
		tdThread.start(); //�����߳�
		td1Thread.start();//�����߳�
		td2Thread.start();//�����߳�
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//����run����
				for(int count=1,row=1;row<10;row++,count++) {
					for(int i=0;i<count;i++) {
						System.out.print("*");
					}
					System.out.println();
				}
	}

}
