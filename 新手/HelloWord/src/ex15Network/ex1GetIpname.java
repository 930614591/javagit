package ex15Network;
import java.io.*;
import java.net.InetAddress;



public class ex1GetIpname {

	public static void main(String[] args) throws Exception {
		InetAddress address1=InetAddress.getLocalHost();
		System.out.println(address1);
		// TODO Auto-generated method stub
		//定义IntAddress类型变量
		InetAddress address=InetAddress.getByName("www.baidu.com");
		System.out.println(address);
		System.out.println("......");
		//
		InetAddress[] addresses=InetAddress.getAllByName("www.baidu.com");
		for (InetAddress inetAddress : addresses) {
			System.out.println(inetAddress);

		}
		
	}

}
