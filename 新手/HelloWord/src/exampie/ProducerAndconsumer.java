package exampie;
//多线程共享队列，锁机制
public class ProducerAndconsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new Queue();//创建并初始化一个队列
		Producer producer=new Producer(queue);//创建并初始化一个生产者
		Consumer consumer=new Consumer(queue);//创建并初始化一个消费者
		consumer.start();//启动消费者线程
		producer.start();//启动生产者线程
	}

}
