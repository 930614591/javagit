package exampie;

public class Producer extends Thread {
	Queue queue;//声明队列
	Producer(Queue queue) {
		// TODO Auto-generated constructor stub
		this.queue=queue;//队列q初始化
	}
	public void run() {
		for(int i=1;i<5;i++) {
			queue.put(i);//向队列中添加新元素
		}
	}
}

