package ex_12;

 class MyarithException extends Exception {
	//����EX_12_12�޲εĹ��췽��
	public MyarithException() {
		// TODO Auto-generated constructor stub
	}
	//���������ַ��������Ĺ��췽��
	public MyarithException(String msgString){
		super(msgString);	//���ø��๹�췽��
	}
	

}
 public class ex12_12{
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			executeRuntime();
		} catch (MyarithException e) {
			// TODO: handle exception
			System.out.println("��������ʱ�쳣��"+e.getMessage());
		}
	}
	static void executeRuntime() throws MyarithException {
		try {
			int i=1/0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			throw new MyarithException(e.getMessage());
		}
	}
 }
