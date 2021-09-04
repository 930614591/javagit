package ex13_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ex13_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileString ="ObjectStreamDemo.txt";//创建并初始化文件名
		Person[] persons= { 
				new Person("张三",23),
				new Person("李四",24)			
		};
		//写入新文件
		writeObjectsToFile(persons, fileString);
		try {
			//读取文件数据
			persons=readObjectdFromFile(fileString);
			//遍历并输出读取对象
			for (Person person : persons) {
				//格式化输出
				System.out.printf("%s\t%d%n", person.getName(),person.getAge());
			}
			System.out.println();
			//初始化persons数组
			persons=new Person[2];
			persons[0]=new Person("王五",21);
			persons[1]=new Person("钱六",21);
			//fujian附加新对象至文件
			appendObjectsToFile(persons, fileString);
			//读取文件数据
			persons=readObjectdFromFile(fileString);
			//显示笃会的对象
			for (Person person : persons) {
				//格式化输出
				System.out.printf("%s\t%d%n", person.getName(),person.getAge());
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("没有指定文件名");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	//将指定的队形写入文件
	public static void writeObjectsToFile(Object[] objsObjects ,String filenameString) {
		File file =new File(filenameString);//创建并初始化file对象
		try {
			//创建并初始化
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
			for (Object object : objsObjects) {
				//将对象写入文件
				objectOutputStream.writeObject(object);
			}
			//关闭流
			objectOutputStream.close();
		} catch (IOException e) {
			//
			e.printStackTrace();//输出异常信息
			// TODO: handle exception
		}
		
	}
	
	//将文件中的对象数据读回
	public static Person[] readObjectdFromFile(String filenameString) throws FileNotFoundException{
		File file=new File(filenameString);
		//如果文件不存在
		if(!file.exists())
			throw new FileNotFoundException();
		//使用List先存储回的对象
		List<Person> list =new ArrayList<Person>();
		try {
			FileInputStream fileInputStream=new FileInputStream(file);
			//创建并初始化fileInputStream
			//
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			while (fileInputStream.available()>0) {
				//读取一个对象并添加到列表中去
				list.add((Person)objectInputStream.readObject());
			}
			objectInputStream.close();//关闭流
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		Person[] person =new Person[list.size()];//chuangji创建并初始化Person数组
		return list.toArray(person);
		
	}
	//将对象附加到指定文件之后
	public static void appendObjectsToFile(Object[] objects ,String filenameString) throws FileNotFoundException{
		File file=new File(filenameString);//创建并初始化File对象file
		//如果文件不存在则抛出异常
		if(!file.exists()) {
			throw new FileNotFoundException();//抛出异常
			
		}
		try {
			//附加模式
			ObjectOutputStream objectInputStream=new ObjectOutputStream(new FileOutputStream(file, true)) {
				//如果要附加对象至文件后，则必须重新定义这个方法
				protected void writeStreamHeader() throws IOException {
					//抛出异常
				}
			};
			for (Object object : objects) {
				//将对象写入文件
				objectInputStream.writeObject(object);
			}
			objectInputStream.close();//关闭流
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	


}
@SuppressWarnings("serial")
class  Person implements Serializable{
	private String nameString;
	private int age;
	//类进行序列化
	//声明Person类的构造方法
	public Person() {
		
	}
	public Person(String nameString,int age) {
		//初始化域
		this.nameString=nameString;
		this.age=age;
	}
	//设置name值
	public void setName(String nameString) {
		this.nameString=nameString;
	}
	public void setAge(int age) {
		this.age=age;
	}
	//返回值
	public String getName() {
		return nameString;
	}
	public int  getAge() {
		return age;
	}
	
}
