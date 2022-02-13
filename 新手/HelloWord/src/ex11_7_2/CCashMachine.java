package ex11_7_2;

public class CCashMachine extends Thread {
	//�̳�Threadʵ���̷߳���
	private CBank bank=null;			//�����ʵ��ʺŶ���
	private CSyncBank sBank=null;		//�����ʵ��˺Ŷ���
	private String accountString="";	//���ʵ��˺Ŷ���
	public CCashMachine(CBank bank,String accountString) {
		//���췽�����г�ʼ��
		this.accountString=accountString;
		this.bank=bank;
	}
	public CCashMachine(CSyncBank sBank,String accountString) {
		//���췽�����г�ʼ��
		this.accountString=accountString;
		this.sBank=sBank;
	}
	public void run() {
		//ʵ��Thread�ķ���
		//��ͬ�������ò�ͬ�ķ���
		if(accountString.equals("saveMoney")) {			//��ͬ�Ĳ������ò�ͬ�ķ���
			bank.saveMoney(1000.0);
		}else if(accountString.equals("withdrawMoney")) {
			bank.withdrawMoney(500.0);
		}else if(accountString.equals("sync_saveMoney")) {			//��ͬ�Ĳ������ò�ͬ�ķ���
			sBank.sync_saveMoney(1000.0);
		}else if(accountString.equals("sync_withdrawMoney")) {
			sBank.sync_withdrawMoney(500.0);
		}
	}
}
