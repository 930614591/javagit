//�̵߳Ĵ���������
public class ThreadCreAndStrart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = new RunnableThread();	//��������ʼ��RunnableThread����
		Thread rThread=new Thread(runnable);		//��������ʼ���̶߳���rThread
		
		
		SubThread sThread=new SubThread();          //��������ʼ��SubThread����
		//�����̵߳����ȼ�
//		sThread.setPriority(1);
//		rThread.setPriority(2);
//		sThread.start();//�����߳�
//		rThread.start();//�����߳�
		sThread.setPriority(2);
		rThread.setPriority(1);
		rThread.start();//�����߳�
		sThread.start();//�����߳�

	}
	//��дrun����
	public static class RunnableThread implements Runnable{
		public void run() {
			System.out.println("RunnableThread�����������ɹ�");
		}
	}
	static class SubThread extends Thread{
		public SubThread() {}			//������ʵ��SubThread�Ĺ��췽��
		
		//������ʵ�ִ�������SubThread���췽��
		public SubThread(String nameString) {
			super(nameString);			//���ø���Ĺ��췽��
		}
		//��дrun����
		public void run() {
			System.out.println("SubThread�����������ɹ�");
		}
		
	}
	
	

}
