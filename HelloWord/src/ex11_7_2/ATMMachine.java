package ex11_7_2;

public class ATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBank bank=new CBank();		//ʵ����CBank����
		CSyncBank sBank=new CSyncBank();	//ʵ����CSyncBank����
		
		System.out.println("1����ȡǮû�в���ͬ���̵߳���������");
		Thread putThread =new CCashMachine(bank, "saveMoney");//��ͬ����Ǯ
		Thread takeThread=new CCashMachine(bank, "withdrawMoney");//��ͬ����Ǯ
		putThread.start();
		takeThread.start();//������ȡ
		
		try {
			putThread.join();
			takeThread.join();//�ȴ����н���
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����߳����г���"+e.getMessage());
		}
		System.out.println();
		//CSyncBank sBank2=new CSyncBank();
		//sBank=new CSyncBank();
		System.out.println("1����ȡǮ����ͬ���̵߳���������");
		Thread putThread1 =new CCashMachine(sBank, "sync_saveMoney");//��ͬ����Ǯ
		Thread takeThread1=new CCashMachine(sBank, "sync_withdrawMoney");//��ͬ����Ǯ
		putThread1.start();
		takeThread1.start();//������ȡ
	}

}
