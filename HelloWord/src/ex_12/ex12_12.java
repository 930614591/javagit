package ex_12;

 class MyarithException extends Exception {
	//声明EX_12_12无参的构造方法
	public MyarithException() {
		// TODO Auto-generated constructor stub
	}
	//声明带有字符串参数的构造方法
	public MyarithException(String msgString){
		super(msgString);	//调用父类构造方法
	}
	

}
 public class ex12_12{
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			executeRuntime();
		} catch (MyarithException e) {
			// TODO: handle exception
			System.out.println("捕获运行时异常："+e.getMessage());
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
