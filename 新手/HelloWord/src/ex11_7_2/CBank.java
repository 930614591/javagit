package ex11_7_2;

public class CBank {
	private double curveMoney=356.64;//存入银行的钱数
	public void saveMoney(double putThread) {
		//存钱处理函数没有采用同步
		System.out.println("当前账户剩余余额为："+this.curveMoney+";存入金额为："+putThread);
		System.out.println("正在操作请稍后。。。。。。");//等待300ms
		
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		System.out.println("操作成功存入金钱："+putThread);
		this.curveMoney=this.curveMoney+putThread;
		System.out.println("当前余额为："+this.curveMoney+"元");
	}
	public void withdrawMoney(double takeThread) {
		//取钱处理函数
		System.out.println("当前账户剩余余额为："+this.curveMoney+";取出金额为："+takeThread);
		System.out.println("正在操作请稍后。。。。。。");//等待300ms
		
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		System.out.println("操作成功取出金钱："+takeThread);
		this.curveMoney=this.curveMoney-takeThread;
		System.out.println("当前余额为："+this.curveMoney+"元");
	}
}
