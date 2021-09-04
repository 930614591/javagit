package ex11_7_2;

public class CCashMachine extends Thread {
	//继承Thread实现线程方法
	private CBank bank=null;			//待访问的帐号对象
	private CSyncBank sBank=null;		//待访问的账号对象
	private String accountString="";	//访问的账号对象
	public CCashMachine(CBank bank,String accountString) {
		//构造方法进行初始化
		this.accountString=accountString;
		this.bank=bank;
	}
	public CCashMachine(CSyncBank sBank,String accountString) {
		//构造方法进行初始化
		this.accountString=accountString;
		this.sBank=sBank;
	}
	public void run() {
		//实现Thread的方法
		//不同参数调用不同的方法
		if(accountString.equals("saveMoney")) {			//不同的参数调用不同的方法
			bank.saveMoney(1000.0);
		}else if(accountString.equals("withdrawMoney")) {
			bank.withdrawMoney(500.0);
		}else if(accountString.equals("sync_saveMoney")) {			//不同的参数调用不同的方法
			sBank.sync_saveMoney(1000.0);
		}else if(accountString.equals("sync_withdrawMoney")) {
			sBank.sync_withdrawMoney(500.0);
		}
	}
}
