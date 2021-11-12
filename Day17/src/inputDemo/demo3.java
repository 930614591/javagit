package inputDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* FileOutputStream写出时文件若不存在，则会创建出一个新文件
*
* */
public class demo3 {
    public static void main(String[] args) throws IOException {
        //.向本工程1.txt写一个文本（outputStream）
        //原始情况下都是覆盖写
        FileOutputStream fileOutputStream=new FileOutputStream("Day17/src/1.txt",true/*在此表示追加写*/);
        fileOutputStream.write(97);
        String tr="你好，中国！\n";
        byte[] b=tr.getBytes();
        fileOutputStream.write(b);
        System.out.println(b.length);
        //while (true);
        //fileOutputStream.close();//关闭流释放资源释放流资源
    }
}
