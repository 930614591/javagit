package exampie;

public class Queue {
	int value=0;//�������value����ֵ
	boolean isEmpyt=true;//�������isEmpyt����ֵ
	//valueԪ�ص���Ŀ isEmpyt���е�״̬
	public synchronized void put(int v) {
		//���庯��put
		//synchronized������֤ͬһʱ�����ֻ��һ���߳�ִ�иô���
		if(!isEmpyt) {
			
			try {System.out.println("�����ߵȴ�");//��ӡ�����Ϣ�����ߵȴ�
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		value+=v;
		//�����������v�޸ı���value
		isEmpyt=false;//״̬
		System.out.println("����������"+v);
		notify();
	}
	public synchronized int get() {
		//dingyi���庯��get
		if(isEmpyt) {
			try {
				System.out.println("�����ߵȴ���");//��ӡ�����Ϣ�����ߵȴ�
				wait();//�ȴ�
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		value--;
		if(value<1) {
			isEmpyt=true;
		}
		System.out.println("����������һ����ʣ�ࣺ"+value);
		notify();
		return value;
	}
}
