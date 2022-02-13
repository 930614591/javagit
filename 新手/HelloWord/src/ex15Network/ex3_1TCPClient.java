package ex15Network;
import java.io.*;
import java.net.*;

public class ex3_1TCPClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket clientSocket=new Socket("127.0.0.1",5050);//使用ip和端口定义客户端Sdcket
		InputStream inputStream=clientSocket.getInputStream();//创建输入流对象in
		OutputStream outputStream=clientSocket.getOutputStream();//创建输出流对象out
		outputStream.write('a');
		char c=(char)inputStream.read();//读取字符串数据给c
		System.out.println("收到"+c);
		outputStream.close();
		inputStream.close();
		clientSocket.close();
	}

}
