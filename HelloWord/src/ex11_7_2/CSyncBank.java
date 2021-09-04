package ex11_7_2;

public class CSyncBank {
	private double curveMoney=356.64;//�������е�Ǯ��
	public synchronized void sync_saveMoney(double putThread) {
		//��Ǯ������û�в���ͬ��
		System.out.println("��ǰ�˻�ʣ�����Ϊ��"+this.curveMoney+";������Ϊ��"+putThread);
		System.out.println("���ڲ������Ժ󡣡���������");//�ȴ�300ms
		
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		System.out.println("�����ɹ������Ǯ��"+putThread);
		this.curveMoney=this.curveMoney+putThread;
		System.out.println("��ǰ���Ϊ��"+this.curveMoney+"Ԫ");
	}
	public synchronized void sync_withdrawMoney(double takeThread) {
		//ȡǮ������
		System.out.println("��ǰ�˻�ʣ�����Ϊ��"+this.curveMoney+";ȡ�����Ϊ��"+takeThread);
		System.out.println("���ڲ������Ժ󡣡���������");//�ȴ�300ms
		
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		System.out.println("�����ɹ�ȡ����Ǯ��"+takeThread);
		this.curveMoney=this.curveMoney-takeThread;
		System.out.println("��ǰ���Ϊ��"+this.curveMoney+"Ԫ");
	}
}
