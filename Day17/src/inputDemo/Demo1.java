package inputDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建一个文件字节输入流对象
        FileInputStream fileInputStream=null;
        try {
             fileInputStream=new FileInputStream("Day17/src/1.txt");
            //2.打开文件一个字节一个字节的读
            System.out.println(fileInputStream.read());
            fileInputStream.read();
        } catch (FileNotFoundException e) {
            System.out.println("文件没有找到！");
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println("内容读取失败！");
            e.printStackTrace();
        }finally {
            fileInputStream.close();
        }
    }
}
