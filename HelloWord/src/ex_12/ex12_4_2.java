package ex_12;

import java.util.Iterator;

public class ex12_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[5];//��������Ԫ�ز�Ϊ����Ԫ�ط����ڲ�
		try {
			for(int i=0;i<5;i++) {
				num[i]=i+1;
				for(int j=0;j<=i;j++) {
					num[i]+=num[j];
				}
			}
			for(int i=0;i<6;i++) {
				System.out.println(num[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("finally�Ǳؾ�֮·��");
		}

	}

}
