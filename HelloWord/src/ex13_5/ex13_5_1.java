package ex13_5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ex13_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fWriter;
		try {
			fWriter=new FileWriter("D:\\eclipse\\java_ee\\HelloWord\\src\\ex13_3\\ex13_5_1.txt");
			//创建字符输出流对象
			BufferedWriter bufferedWriter=new BufferedWriter(fWriter);//创建换成冲字符输出对象
			for (int i = 0; i < 10; i++) {
				bufferedWriter.write("java"+i+"\n");
			}
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
