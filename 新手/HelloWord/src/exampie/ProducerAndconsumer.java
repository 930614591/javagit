package exampie;
//���̹߳�����У�������
public class ProducerAndconsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new Queue();//��������ʼ��һ������
		Producer producer=new Producer(queue);//��������ʼ��һ��������
		Consumer consumer=new Consumer(queue);//��������ʼ��һ��������
		consumer.start();//�����������߳�
		producer.start();//�����������߳�
	}

}
