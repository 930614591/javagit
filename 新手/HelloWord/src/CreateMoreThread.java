//���߳�ʵ��
public class CreateMoreThread extends Thread {
	public void run() {
		//����run����
		for(int count=1,row=1;row<10;row++,count++) {
			for(int i=0;i<count;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//�����޲εĿչ��췽��
	public CreateMoreThread() {}
	//���������ַ����Ĺ��췽��
	CreateMoreThread(String szNameString){
		super(szNameString);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub �����̣߳������߳�
		CreateMoreThread td1CreateMoreThread= new CreateMoreThread();
		CreateMoreThread td2CreateMoreThread= new CreateMoreThread();
		CreateMoreThread td3CreateMoreThread= new CreateMoreThread();
		td1CreateMoreThread.start();
		td2CreateMoreThread.start();
		td3CreateMoreThread.start();
		
		

	}

}
