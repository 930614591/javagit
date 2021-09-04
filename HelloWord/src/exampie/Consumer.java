package exampie;


public class Consumer extends Thread {
	Queue queue;
	Consumer(Queue queue) {
		this.queue=queue;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		while(true) {
			queue.get();
		}
	}

}
