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
			//Դ�ļ�
			FileInputStream fileInputStream=new FileInputStream(new File(args[0]));
			//Ŀ���ļ�
			FileOutputStream fileOutputStream=new FileOutputStream(new File(args[1]));
			
			//available()��ȡ��δ�������ݳ���
			System.out.println("�����ļ���"+fileInputStream.available()+"�ֽ�");
			while (true) {
				if(fileInputStream.available()<1024) {
					//ʣ����ֽڱ�1024��
					//һλһλ�ض�ȡ������д��Ŀ���ļ�
					int remain=-1;
					while ((remain=fileInputStream.read())!=-1) {
						fileOutputStream.wait(remain);
					}
					break;
				}else {
					//��ȡԴ�ļ���������
					fileInputStream.read(buffer);
					//����������д��Ŀ���ļ�
					fileOutputStream.wait();
				}
			}
			//�ر���
			fileInputStream.close();
			fileOutputStream.close();
			System.out.println("������ɣ�");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
