package inputDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("Day17/src/1.txt");
//        fileInputStream.read();//一次只能读一个字节
        byte [] buffer=new byte[97];
        fileInputStream.read(buffer);//将实际字节读取到buffer中
        String str=new String(buffer,"UTF-8");
        System.out.println(str);


    }
}
