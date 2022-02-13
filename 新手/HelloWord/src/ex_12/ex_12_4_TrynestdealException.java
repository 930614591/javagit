package ex_12;

public class ex_12_4_TrynestdealException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tryCatch();
	}
	
	static void tryCatch() {
		try {						//外层try语句块
			try {
				System.out.println("执行里层try块\n");
				int inte=Integer.parseInt("pencil");
				System.out.println(inte);
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("执行里层catch1块\n");
				System.out.println("捕获ArrayIndexOutOfBoundsException异常："+e.getMessage());
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("执行里层catch2块\n");
				System.out.println("捕获ArithmeticException异常："+e.getMessage());
				
			} catch (ClassCastException e) {
				// TODO: handle exception
				System.out.println("执行里层catch3块\n");
				System.out.println("捕获ClassCastException异常："+e.getMessage());
			}
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("捕获NumberFormatException异常："+e.getMessage());
		}
	}
}
