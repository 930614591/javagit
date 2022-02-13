package inputDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        //1.使用字符流去写FileWrter
        FileWriter fileWriter=new FileWriter("Day17/src/1.txt",true);
//        fileWriter.write("你好哇！");//覆盖写法，会抹去原文件
//        fileWriter.write("\n");
//        fileWriter.write("真的好吗！");
//        fileWriter.write("Are you ok!");
        //
        fileWriter.append("你好！");
        fileWriter.append("真不错");

        fileWriter.close();
    }
}
