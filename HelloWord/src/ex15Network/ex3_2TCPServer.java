package ex15Network;
import java.io.*;
import java.net.*;

public class ex3_2TCPServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket listenServerSocket=new ServerSocket(5050);//定义监听对象listen
		Socket serverSocket=listenServerSocket.accept();//定义server套接字
		InputStream inputStream=serverSocket.getInputStream();//
		OutputStream outputStream=serverSocket.getOutputStream();//
		char c=(char)inputStream.read();//提取in中字符给c
		System.out.println("收到"+c);
		outputStream.write('s');
		outputStream.close();
		inputStream.close();
		serverSocket.close();
		listenServerSocket.close();
	}

}
