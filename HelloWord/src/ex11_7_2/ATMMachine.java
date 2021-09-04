package ex11_7_2;

public class ATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBank bank=new CBank();		//实例化CBank对象；
		CSyncBank sBank=new CSyncBank();	//实例化CSyncBank对象
		
		System.out.println("1、存取钱没有采用同步线程的流程如下");
		Thread putThread =new CCashMachine(bank, "saveMoney");//非同步存钱
		Thread takeThread=new CCashMachine(bank, "withdrawMoney");//非同步存钱
		putThread.start();
		takeThread.start();//启动存取
		
		try {
			putThread.join();
			takeThread.join();//等待运行结束
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("两个线程运行出错！"+e.getMessage());
		}
		System.out.println();
		//CSyncBank sBank2=new CSyncBank();
		//sBank=new CSyncBank();
		System.out.println("1、存取钱采用同步线程的流程如下");
		Thread putThread1 =new CCashMachine(sBank, "sync_saveMoney");//非同步存钱
		Thread takeThread1=new CCashMachine(sBank, "sync_withdrawMoney");//非同步存钱
		putThread1.start();
		takeThread1.start();//启动存取
	}

}
