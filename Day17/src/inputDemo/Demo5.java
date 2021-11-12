package inputDemo;

import java.io.FileReader;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        //1.字符流就是为了文本文件服务的Filereader 文件字符读取流
        FileReader fileReader=new FileReader("Day17/src/1.txt");
//        int i= fileReader.read();
//        System.out.println((char)i);
        //采用单个字符来读输出全部内容
//        int len=0;
//        while((len=fileReader.read())!=-1){
//            System.out.print((char) len);
//        }
        //读十个字符装一次
        char[] buffer=new char[6];//缓冲区（提高文件效率）
        int i=fileReader.read(buffer);//读取字符（6个实际读取到的字符）放到buffer中（缓冲区）
        int len=0;//实际读取到的字符个数
        while ((len=fileReader.read(buffer))!=-1){
            String s=new String(buffer,0,len);//通过偏移量纠正最后一次读取,防止重复，此时的len表示实际读取到的字符个数
            System.out.print(s);

        }

    }
}
