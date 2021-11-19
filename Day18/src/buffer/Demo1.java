package buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
/*
*
* 复制文件时文件与工程编码一致
* */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //GBK转换成TUF-8格式字符串
        BufferedReader bufferedReader=new BufferedReader(new FileReader(""));//在此处按创建一个文件对象
        int read= bufferedReader.read();//读取文件对象内容
        System.out.println(read);
//        String str="你好啊";
//        String string= new String(str.getBytes("GBK"),"UTF-8");
    }
}
