package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) throws IOException {
//        //1.如何让使用IO流来读取System。in键盘输入
//        InputStream ps=System.in;///会产生阻塞，等待键盘盘的输入
//        //键盘输入实际上是一个字节流
//        int read=ps.read();
//        System.out.println("test:"+(char)read);
//        
        //常用的键盘使用的字符流比较简单
        //转换流 见字节流转换成字符流
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));//先包装再存入缓冲区
        System.out.println("键盘输入："+bufferedReader.readLine());
    }
}
