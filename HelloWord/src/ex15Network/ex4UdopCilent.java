
package ex15Network;
import java.io.*;
import java.net.*;
import java.security.PublicKey;
import java.sql.BatchUpdateException;
import java.util.Scanner;
public class ex4UdopCilent {
//udp网络程序
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new ex4UdopCilent().init();
		}
	
	
		//定义发送数据包的目的地
		public static final int DEST_PORT=30000;
		
		public static final String dEST_IPString="127.0.0.1";
		
		public static final int DATA_LEN=4096;//定义每个接受数据的数据包最大为4k
		
		byte[] inBuff=new byte[DATA_LEN];//定义接受网络数据的字节数组
		
		//创建准备接受数据的Datagrampacket对象
		private DatagramPacket inPacket=new DatagramPacket(inBuff, inBuff.length);
		
		private DatagramPacket outPacket=null;//定义一个用于发送数据的DataramPacket对象
		
		public void init ()throws IOException{
			try(
				//创建一个客户端对象DatagramSocket，使用随机端口
				DatagramSocket socket=new DatagramSocket()) 
				{
				//初始化发送数据用的DatagramSocket，它包含一个长度为零的字节数据
				outPacket=new DatagramPacket(new byte[0], 0	, InetAddress.getByName(dEST_IPString),DEST_PORT);
				
				Scanner scanner=new Scanner(System.in);//创建键盘输入流
				
				while (scanner.hasNextLine()) {
					
					//将键盘输入的一行字符串转换成字节数组
					byte[] buff=scanner.nextLine().getBytes();
					
					outPacket.setData(buff);//发送数据用的DatagramPacket中的字节数据
					
					socket.send(outPacket);//发送数据包
					
					//读取Socket中的数据，读到的数据放在inPacket所封装的字节数组里面
					socket.receive(inPacket);
					
					System.out.println(new String (inBuff,0,inPacket.getLength()));
					
					
					}
				}
			
			
		}
		
		
	

}
