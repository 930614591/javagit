package ex13_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class ex13_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//hanchongsysten。in字符
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			//缓冲字符输出流
			BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("D:\\eclipse\\java_ee\\HelloWord\\src\\ex13_3\\ex13_10.txt"));
			String inputString=null;
			//每读一次进行一次写入动作
			while(!(inputString=bufferedReader.readLine()).equals("quit")) {
				bufferedWriter.write(inputString);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
