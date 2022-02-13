package ex_12;

public class ex12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int iInt=5/0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("toString:"+e.toString());
			System.out.println("getMessage():"+e.getMessage());
			System.out.println("printStackTrace():");
			e.printStackTrace();
		}
	}

}
