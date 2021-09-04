package exampie;

public class Queue {
	int value=0;//定义变量value并赋值
	boolean isEmpyt=true;//定义变量isEmpyt并赋值
	//value元素的数目 isEmpyt队列的状态
	public synchronized void put(int v) {
		//定义函数put
		//synchronized加锁保证同一时刻最多只有一个线程执行该代码
		if(!isEmpyt) {
			
			try {System.out.println("生产者等待");//打印输出信息生产者等待
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		value+=v;
		//根据输入参数v修改变量value
		isEmpyt=false;//状态
		System.out.println("生产者数量"+v);
		notify();
	}
	public synchronized int get() {
		//dingyi定义函数get
		if(isEmpyt) {
			try {
				System.out.println("消费者等待！");//打印输出信息消费者等待
				wait();//等待
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		value--;
		if(value<1) {
			isEmpyt=true;
		}
		System.out.println("消费者消费一个，剩余："+value);
		notify();
		return value;
	}
}
