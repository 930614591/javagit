package ex11_7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleepWake  extends Thread{
	private DateFormat dateFormat=new SimpleDateFormat("ss:SS");
	
	//java���������
	public static void main(String[] argsStrings) {
		
		//BasketballPersonManage mythread=new BasketballPersonManage();//���������
		
		
		
	}
	
	public void incident() {
		Thread.currentThread().interrupt();//���ѵ�ǰ�߳�
		while(true) {
			if(Thread.currentThread().isInterrupted()) {
				//�жϵ�ǰ�߳��Ƿ񱻻���
				System.out.println(dateFormat.format(new Date())+"������ʼ�����Ƿ�׼���ϳ�");
				System.out.println(Thread.currentThread().isInterrupted()?"��":"û��");
				try {
					Thread.currentThread();
					Thread.sleep(5000);//		�߳�����5��
				} catch (InterruptedException e) {//�������쳣
					System.out.println(dateFormat.format(new Date())+"�յ����������ֹͣ��Ϣ��"+e.getMessage());
					// TODO: handle exception
				}
				System.out.println(dateFormat.format(new Date())+"���α����������Ƿ�μ���һ��������");
				System.out.println(Thread.currentThread().isInterrupted()?"��":"���μ�");
			}
		}
	}
	public void run() {
		System.out.println("��һ������������ʱ��Ϊ��"+dateFormat.format(new Date()));
		System.out.println("��Ϣ��Сʱ");
		try {
			sleep(2000);//�߳�����2s����1s��һСʱ
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(dateFormat.format(new Date())+"�յ����������׼���ϳ���"+e.getMessage());
		}
		System.out.println(dateFormat.format(new Date())+"����Ϣ�������Ƿ��ֲμ������ı�����");
		try {
			sleep(2000);//��������
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(dateFormat.format(new Date())+"�յ����������׼���ϳ���"+e.getMessage());
		}
		System.out.println(Thread.currentThread().isInterrupted()?"�μӱ���":"û�вμӱ���");
		interrupt();//�����߳�
		System.out.println(dateFormat.format(new Date())+"��Ϣ�У��油��Ա���ˣ��Ƿ�μӱ�����");
		System.out.println(Thread.currentThread().isInterrupted()?"�μ�":"���μ�");
	}
	
}
