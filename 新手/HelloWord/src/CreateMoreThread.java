//多线程实例
public class CreateMoreThread extends Thread {
	public void run() {
		//重载run方法
		for(int count=1,row=1;row<10;row++,count++) {
			for(int i=0;i<count;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//声明无参的空构造方法
	public CreateMoreThread() {}
	//声明带有字符串的构造方法
	CreateMoreThread(String szNameString){
		super(szNameString);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 创建线程，运行线程
		CreateMoreThread td1CreateMoreThread= new CreateMoreThread();
		CreateMoreThread td2CreateMoreThread= new CreateMoreThread();
		CreateMoreThread td3CreateMoreThread= new CreateMoreThread();
		td1CreateMoreThread.start();
		td2CreateMoreThread.start();
		td3CreateMoreThread.start();
		
		

	}

}
