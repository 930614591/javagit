package ex13;

import java.io.*;
import java.util.*;

//import com.sun.net.httpserver.Filter;

public class ex13_2_2 {
	
	public  void ReadFileList(File file,Filter filter) {
		if(file.isDirectory()) {//判断file是否是目录
			try {
				//lie列出所有文件及目录
				File[] files =file.listFiles(filter);//创建目录数组
				//通过数组创建数组列表
				ArrayList<File> fileList=new ArrayList<File>();
				for (int i=0;i<files.length;i++) {
					//for循环变量数组
					//先列出目录
					if(files[i].isDirectory()) {
						//判断是否为目录
						//输出路径名
						System.out.println("{"+file.getPath()+"}");
						ReadFileList(files[i], filter);//递归调用ReadFileList（方法）
						
					}else {
						//文件先存入fileList文件夹
						fileList.add(files[i]);
					}
				}
				//列出文件
				for (File f : fileList) {//for-each变量数组
					ReadFileList(f, filter);//调用ReadFileList方法
					
				}
				System.out.println();//输出换行符
				
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				e.printStackTrace();//打印异常信息
			}
			
		}else if(file.isFile()) {
			//当file为文件时
			FileDesc(file);//
		}
		
	}
	
	
	public void FileDesc(File file) {
		if(file.isFile()) {
			//判断是否为文件
			System.out.println(file.toString()+"\n该文件");//输出字符串信息
			System.out.println(file.canRead()?"可读":"不可读");//判断文件是否可读
			System.out.println(file.canWrite()?"可写":"不可写");//判断文件是否可写
			System.out.println(file.length()+"字节");//shuchu输出字节数

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filenameString="D:\\eclipse\\java_ee\\HelloWord\\src\\ex_12\\ex12_2.java";//由参数获取文件名
		//String filenameString=args[0];
		File file =new File(filenameString);//创建并初始化由文件名决定的文件对象
		Filter filter =new Filter("java");//创建并初始化文件过滤器java文件
		//创建Filedome实例，并调用ReadFileList方法
		new ex13_2_2().ReadFileList(file,filter);

	}

}
class Filter implements FilenameFilter{
	String extentString;
	//声明实现Filter类的构造方法
	Filter(String extentString){
		this.extentString=extentString;//初始化成员变量
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		
		return name.endsWith("."+extentString);//返回文件的扩展名
	}
	
}
