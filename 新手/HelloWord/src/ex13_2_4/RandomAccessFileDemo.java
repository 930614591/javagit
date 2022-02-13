package ex13_2_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void RandomWriteFile(File file) {
		Employee[] employees=new Employee[4];
		//����employ����
		employees[0]=new Employee("����", 23);
		employees[1]=new Employee("����", 24);
		employees[2]=new Employee("����", 25);
		employees[3]=new Employee("Ǯ��", 26);
		RandomAccessFile randomAccessFile=null;//����randomAccessFile����
		try {
			randomAccessFile=new RandomAccessFile(file, "rw");//��ʼ��randomAccessFile
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();//����쳣��Ϣ
		}
		try {
			for (Employee employee : employees) {
				randomAccessFile.writeChars(employee.getName());//д������
				randomAccessFile.writeInt(employee.getAge());//д������
			}
			randomAccessFile.close();//guan�ر�randomAccessFile
		} catch (IOException e) {//buhuoyichang�����쳣
			// TODO: handle exception
			e.printStackTrace();//����쳣��Ϣ
		}
	}
	private static String randNameString(RandomAccessFile randomAccessFile) throws IOException{
		char[] name=new char[8];//����char��������
		for(int i=0;i<name.length;i++) {
			name[i]=randomAccessFile.readChar();//��ȡ�ַ�
			//�����ַ���Ϊ�ո񲢷���
			
		}
		return new String(name).replace("\0", " ");
		
	}
	public static Employee[] RandomReadFile(File file) throws Exception{
		RandomAccessFile randomAccessFile;//����randomAccessFile
		randomAccessFile=new RandomAccessFile(file, "r");//��ʼ��randomAccessFile
		Employee[] employees=new Employee[4];//����Employee
		//Employee��ռ�õĿռ�
		int num=(int)randomAccessFile.length()/Employee.size();
		for (int i = 0; i < num; i++) {
			randomAccessFile.seek((i)*Employee.size());
			//ʹ�ö�Ӧ�ķ�����������
			employees[i]=new Employee(randNameString(randomAccessFile), randomAccessFile.readInt());
		}
		randomAccessFile.close();//�ر�randomAccessFile����
		return employees;//��������
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filenameString="employeeExample";//��������ʼ���ļ�����
		File file=new File(filenameString);//��������ʼ��File����
		RandomWriteFile(file);//����RandomWriteFile����
		Employee[] employees=RandomReadFile(file);//�����ļ��б����employees
		//ʹ��for����employees����
		for (Employee employee : employees) {
			System.out.println("name="+employee.getName()+"\t|\tage="+employee.getAge());
		}

	}

}
