package ex13_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import ex13_2_4.Employee;

public class ex13_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filenameString="d:\\DataIOStream.txt";//��������ʼ���ļ����ַ���
		//��������ʼ��Employee�ַ���
		Employee[] employees= {
				new Employee("张三", 23),
				new Employee("李四", 24),
				new Employee("王五", 25),
				new Employee("钱六", 26)};
		try {
			//����
			DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream(filenameString));
			for (Employee Employee : employees) {
				//ʹ��forѭ������
				//xieruд��UTF�ַ�
				dataOutputStream.writeUTF(Employee.getName());
				//д��int�ַ�
				dataOutputStream.writeInt(Employee.getAge());
				System.out.println(Employee.getName()+"\t"+Employee.getAge());

			}
			//��������������Ŀ�ĵ�
			dataOutputStream.flush();
			//�ر���
			dataOutputStream.close();
			DataInputStream dataInputStream=new DataInputStream(new FileInputStream(filenameString));
			//�������ݲ���ԭΪ����
			for (int i = 0; i < employees.length; i++) {
				//����UTF�ַ���
				String nameString=dataInputStream.readUTF();
				//����int����
				int score=dataInputStream.readInt();
				employees[employees.length-1-i]=new Employee(nameString, score);
				
			}
			//�ر���
			dataInputStream.close();
			//�����ԭ������
			for (Employee Employee : employees) {
				//��ʽ�����
				System.out.println(Employee.getName()+"\t"+Employee.getAge());
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}



}
