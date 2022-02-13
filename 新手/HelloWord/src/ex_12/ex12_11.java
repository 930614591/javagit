package ex_12;

public class ex12_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			execute();
		} catch (ex12_10 e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	static void execute() throws ex12_10{
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			throw new ex12_10("自定义异常抛出："+e.getMessage());
		}
	}

}
