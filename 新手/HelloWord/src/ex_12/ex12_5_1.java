package ex_12;

public class ex12_5_1 {
	static void demoproc(String v1) {
		try {
			//�׳�NULLpointerException�쳣
			if(v1==null) {
				throw new NullPointerException("ThrowExample");
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("����Ĳ���Ϊ��");
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String string=null;
			demoproc(string);
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("�쳣���Ϊ��"+e);
		}
	}
	

}
