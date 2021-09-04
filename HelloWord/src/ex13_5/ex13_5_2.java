package ex13_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ex13_5_2 {

	public static final String SUFFIX=".txt";//分割后的文件拓展
	//将指定的文件按照给定的文件的字节数进行分割
	public static String[] divide(String name,long size) throws Exception{
		File file =new File(name);
		if(!file.exists()||(!file.isFile())) {
			throw new Exception("指定文件不存在！");
		}
		//获得被分割的文件，将来被分割成小的文件存放在这个目录下
		File parentFile=file.getParentFile();
		long fileLength=file.length();//取得文件的大小
		if (size<=0) {
			size=fileLength/2;
		}
		//取得被分割后的小文件的数目
		int num=(fileLength%size!=0)?(int)(fileLength/size+1):(int)(fileLength/size);
		String[] fileNameStrings=new String[num];
		//存放被分割后的小文件名
		FileInputStream fileInputStream=new FileInputStream(file);//输入文件流，即被分割的文件
		long end =0;//输入文件流的开始和结束下标
		int begin=0;
		for(int i=0;i<num;i++) {
			//对于n-1之前的文件都指定为size大小
			File outFile =new File(parentFile,file.getName()+i+SUFFIX);
			FileOutputStream fileOutputStream=new FileOutputStream(outFile);
			//构建小文件输出流
			end+=size;//结束后下标后医size
			end=(end>fileLength)?fileLength:end;
			for (;begin<end;begin++) {
				//从输入流中读取字节存储到输出流中
				fileOutputStream.write(fileInputStream.read());
			}
			fileOutputStream.close();
			
			
		}
		return fileNameStrings;
		
	}
	
	
	public static void readFileMessage(String fileName) {
		//读出分割成小文件的内容
		File file=new File(fileName);
		BufferedReader reader=null;
		try {
			reader=new BufferedReader(new FileReader(file));
			String string =null;
			//按行读取内容知道null则表示文件读取结束
			while ((string=reader.readLine())!=null) {
				System.out.println(string);
			}
			reader.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(reader!=null) {
				try {
					reader.close();
				} catch (IOException e2) {
					// TODO: handle exception
				}
			}
		}
	}
	
	
	public static void main(final String[] args) throws Exception {
		// TODO Auto-generated method stub
		String nameString="D:\\eclipse\\java_ee\\HelloWord\\src\\ex13_3\\ex13_5_1.txt";
		//准被测试的文件
		long size=25;
		String[] filenameStrings=ex13_5_2.divide(nameString,size);
		System.out.println("文件"+nameString+"分割结果如下：");
		for (int i = 0; i < filenameStrings.length; i++) {
			System.out.println(filenameStrings[i]+"的内容如下：");
			ex13_5_2.readFileMessage(filenameStrings[i]);
			System.out.println();

			
		}
		
	}

}

