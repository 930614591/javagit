package ex15Network;
import java.io.*;
import java.net.*;
public class ex4_2UDPServer {
	
	public static final int PORT=30000;
	
	private static final int DATA_LEN=4096;//定义每个数据包最大为4k
	
	byte[] inBuff=new byte[DATA_LEN];//定义接受数据的字节数组
	
	//以指定字节数组创建准备接受数据的DatagramPacket对象
	private DatagramPacket inPacket=new DatagramPacket(inBuff, inBuff.length);
	
	private DatagramPacket outPacket;//定义一个用于发送的DatagramPacket对象
	//private DatagramPacket outPacket2;
	// private DatagramPacket outPacket3;
	
	String[] bookStrings=new String[] {
		//定义一个字符串数组
		"java核心技术·卷2：高级特性",
		"JAVA EE 企业用用实战",
		"JAVA 9 实战",
		"Spring 源码深度解析"
	};
	
	public void init()throws IOException{
		try(
			DatagramSocket socket=new DatagramSocket(PORT)	)//创建DatageamSocket对象
		{
			//采用循环接收数据
			for (int i = 0; i < 1000; i++) {
			//读取socket中的数据，放到inpacket封装的数组里
				socket.receive(inPacket);
				
				//判断inpacket。getdata和inbuff是否是同一个数组
				System.out.println(inBuff==inPacket.getData());
				
				//将接收到的内容转化成字符串后输出
				System.out.println(new String(inBuff,0,inPacket.getLength()));
				
				//从字符串数组中取出一个元素作为发送数据
				byte[] sendData=bookStrings[i%4].getBytes();
				byte[] string=inBuff;
				//sendData=new byte[sendData.length+string.length];
				//以指定字节数组徐作为发送数据，以刚接收的DatagramPacket的
				//源SocketAddress作为目标SocketAddress创建Datagrampacket
				outPacket=new DatagramPacket(sendData, sendData.length,inPacket.getSocketAddress());
				//outPacket2=new DatagramPacket(string, string.length,inPacket.getSocketAddress());
				//outPacket3=outPacket+outPacket;
				//发送数据包
				socket.send(outPacket);
				
				//socket.send(outPacket2);
				
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new ex4_2UDPServer().init();
	}

}
