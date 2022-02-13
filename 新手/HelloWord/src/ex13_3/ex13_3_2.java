package ex13_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex13_3_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			byte[] buffer=new byte[1024];
			//源文件
			FileInputStream fileInputStream=new FileInputStream(new File(args[0]));
			//目的文件
			FileOutputStream fileOutputStream=new FileOutputStream(new File(args[1]));
			
			//available()可取的未读的数据长度
			System.out.println("复制文件："+fileInputStream.available()+"字节");
			while (true) {
				if(fileInputStream.available()<1024) {
					//剩余的字节比1024少
					//一位一位地读取数据再写入目的文件
					int remain=-1;
					while ((remain=fileInputStream.read())!=-1) {
						fileOutputStream.wait(remain);
					}
					break;
				}else {
					//读取源文件到缓冲区
					fileInputStream.read(buffer);
					//将数组数据写入目的文件
					fileOutputStream.wait();
				}
			}
			//关闭流
			fileInputStream.close();
			fileOutputStream.close();
			System.out.println("复制完成！");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
