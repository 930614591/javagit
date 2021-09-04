package ex13;

import java.io.*;
import java.util.*;

//import com.sun.net.httpserver.Filter;

public class ex13_2_2 {
	
	public  void ReadFileList(File file,Filter filter) {
		if(file.isDirectory()) {//�ж�file�Ƿ���Ŀ¼
			try {
				//lie�г������ļ���Ŀ¼
				File[] files =file.listFiles(filter);//����Ŀ¼����
				//ͨ�����鴴�������б�
				ArrayList<File> fileList=new ArrayList<File>();
				for (int i=0;i<files.length;i++) {
					//forѭ����������
					//���г�Ŀ¼
					if(files[i].isDirectory()) {
						//�ж��Ƿ�ΪĿ¼
						//���·����
						System.out.println("{"+file.getPath()+"}");
						ReadFileList(files[i], filter);//�ݹ����ReadFileList��������
						
					}else {
						//�ļ��ȴ���fileList�ļ���
						fileList.add(files[i]);
					}
				}
				//�г��ļ�
				for (File f : fileList) {//for-each��������
					ReadFileList(f, filter);//����ReadFileList����
					
				}
				System.out.println();//������з�
				
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				e.printStackTrace();//��ӡ�쳣��Ϣ
			}
			
		}else if(file.isFile()) {
			//��fileΪ�ļ�ʱ
			FileDesc(file);//
		}
		
	}
	
	
	public void FileDesc(File file) {
		if(file.isFile()) {
			//�ж��Ƿ�Ϊ�ļ�
			System.out.println(file.toString()+"\n���ļ�");//����ַ�����Ϣ
			System.out.println(file.canRead()?"�ɶ�":"���ɶ�");//�ж��ļ��Ƿ�ɶ�
			System.out.println(file.canWrite()?"��д":"����д");//�ж��ļ��Ƿ��д
			System.out.println(file.length()+"�ֽ�");//shuchu����ֽ���

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filenameString="D:\\eclipse\\java_ee\\HelloWord\\src\\ex_12\\ex12_2.java";//�ɲ�����ȡ�ļ���
		//String filenameString=args[0];
		File file =new File(filenameString);//��������ʼ�����ļ����������ļ�����
		Filter filter =new Filter("java");//��������ʼ���ļ�������java�ļ�
		//����Filedomeʵ����������ReadFileList����
		new ex13_2_2().ReadFileList(file,filter);

	}

}
class Filter implements FilenameFilter{
	String extentString;
	//����ʵ��Filter��Ĺ��췽��
	Filter(String extentString){
		this.extentString=extentString;//��ʼ����Ա����
	}
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		
		return name.endsWith("."+extentString);//�����ļ�����չ��
	}
	
}
