package ex_12;

public class ex_12_4_TrynestdealException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tryCatch();
	}
	
	static void tryCatch() {
		try {						//���try����
			try {
				System.out.println("ִ�����try��\n");
				int inte=Integer.parseInt("pencil");
				System.out.println(inte);
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("ִ�����catch1��\n");
				System.out.println("����ArrayIndexOutOfBoundsException�쳣��"+e.getMessage());
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("ִ�����catch2��\n");
				System.out.println("����ArithmeticException�쳣��"+e.getMessage());
				
			} catch (ClassCastException e) {
				// TODO: handle exception
				System.out.println("ִ�����catch3��\n");
				System.out.println("����ClassCastException�쳣��"+e.getMessage());
			}
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("����NumberFormatException�쳣��"+e.getMessage());
		}
	}
}
