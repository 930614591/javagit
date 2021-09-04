package ex_12;

import java.io.IOException;

public class ex12_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("请输入字符：");
			String string=getInputString();
			System.out.println("输入的字符为：");
			System.out.println(string);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("产生异常："+e.getMessage());
		}

	}
	static String getInputString() throws IOException{
		char[] buffer=new char[10];
		int count=0;
		boolean flag=true;
		while(flag) {
			buffer[count]=(char)System.in.read();
			//
			if(buffer[count]=='\n') {
				flag=false;
			}else {
				count++;
			}
			if(count>=10) {
				IOException aException=new IOException("buffer is full");
				throw aException;//抛出异常
			}
		}
		return new String(buffer);
	}

}
