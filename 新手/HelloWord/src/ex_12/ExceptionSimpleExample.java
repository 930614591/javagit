package ex_12;
//�쳣��Ļ�����ʽ
public class ExceptionSimpleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("try����ִ��");	
			System.out.println("throw�׳��쳣");
			throw(new Exception("�׳�Exception�쳣ʵ����"));
		} catch (Exception e) {
			// TODO: handle exception
			//buhuo�����쳣
			System.out.println("catch����ִ�У������쳣������");
			System.out.println("toString()\n"+e.toString());
			
		}finally {
			System.out.println("finally����ִ��");
		}

	}

}
