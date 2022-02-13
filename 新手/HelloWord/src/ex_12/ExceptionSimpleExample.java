package ex_12;
//异常类的基本样式
public class ExceptionSimpleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("try语句的执行");	
			System.out.println("throw抛出异常");
			throw(new Exception("抛出Exception异常实例："));
		} catch (Exception e) {
			// TODO: handle exception
			//buhuo捕获异常
			System.out.println("catch语句的执行，捕获异常并处理");
			System.out.println("toString()\n"+e.toString());
			
		}finally {
			System.out.println("finally语句的执行");
		}

	}

}
