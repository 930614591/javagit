package inputDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo6 {
    public static void main(String[] args) throws IOException {
        //1.使用字符流去写FileWrter
        FileWriter fileWriter=new FileWriter("Day17/src/1.txt");
        fileWriter.write("你好哇！");
        fileWriter.write("\n");
        fileWriter.write("真的好吗！");


        fileWriter.close();
    }
}
