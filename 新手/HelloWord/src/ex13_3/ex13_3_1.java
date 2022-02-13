package ex13_3;

import java.io.IOException;

public class ex13_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("请输入字符：");//显示字符串信息
			System.out.println("输入字符以十进制表示为"+System.in.read());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
