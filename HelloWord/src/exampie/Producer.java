package exampie;

public class Producer extends Thread {
	Queue queue;//��������
	Producer(Queue queue) {
		// TODO Auto-generated constructor stub
		this.queue=queue;//����q��ʼ��
	}
	public void run() {
		for(int i=1;i<5;i++) {
			queue.put(i);//������������Ԫ��
		}
	}
}

