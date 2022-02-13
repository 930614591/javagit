package ex13_2_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void RandomWriteFile(File file) {
		Employee[] employees=new Employee[4];
		//创建employ数组
		employees[0]=new Employee("张三", 23);
		employees[1]=new Employee("李四", 24);
		employees[2]=new Employee("王五", 25);
		employees[3]=new Employee("钱六", 26);
		RandomAccessFile randomAccessFile=null;//创建randomAccessFile数组
		try {
			randomAccessFile=new RandomAccessFile(file, "rw");//初始化randomAccessFile
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();//输出异常信息
		}
		try {
			for (Employee employee : employees) {
				randomAccessFile.writeChars(employee.getName());//写入名字
				randomAccessFile.writeInt(employee.getAge());//写入年龄
			}
			randomAccessFile.close();//guan关闭randomAccessFile
		} catch (IOException e) {//buhuoyichang捕获异常
			// TODO: handle exception
			e.printStackTrace();//输出异常信息
		}
	}
	private static String randNameString(RandomAccessFile randomAccessFile) throws IOException{
		char[] name=new char[8];//创建char类型数组
		for(int i=0;i<name.length;i++) {
			name[i]=randomAccessFile.readChar();//读取字符
			//将空字符改为空格并返回
			
		}
		return new String(name).replace("\0", " ");
		
	}
	public static Employee[] RandomReadFile(File file) throws Exception{
		RandomAccessFile randomAccessFile;//创建randomAccessFile
		randomAccessFile=new RandomAccessFile(file, "r");//初始化randomAccessFile
		Employee[] employees=new Employee[4];//创建Employee
		//Employee类占用的空间
		int num=(int)randomAccessFile.length()/Employee.size();
		for (int i = 0; i < num; i++) {
			randomAccessFile.seek((i)*Employee.size());
			//使用对应的方法读出数据
			employees[i]=new Employee(randNameString(randomAccessFile), randomAccessFile.readInt());
		}
		randomAccessFile.close();//关闭randomAccessFile方法
		return employees;//返回数组
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String filenameString="employeeExample";//创建并初始化文件名称
		File file=new File(filenameString);//创建并初始化File对象
		RandomWriteFile(file);//调用RandomWriteFile方法
		Employee[] employees=RandomReadFile(file);//返回文件中保存的employees
		//使用for遍历employees数组
		for (Employee employee : employees) {
			System.out.println("name="+employee.getName()+"\t|\tage="+employee.getAge());
		}

	}

}
