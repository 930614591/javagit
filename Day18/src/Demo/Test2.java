package Demo;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //1.从键盘像文件中写入数据

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//接受从键盘获取的数据
        BufferedWriter bw=new BufferedWriter(new FileWriter("day18/src/demo/1.txt"));//创建写入流对象
        for (int i=0;i<3;i++){//如果变成了死循环，就需要手动刷新缓存区
            System.out.println("请输入要写的文件：");
            String str=br.readLine();//获取键盘输入内容
            bw.write(str);//向文件写入str的内容，暂时将一些数据存放在缓存区
            bw.newLine();//向文件中输入一个回车
            bw.flush();//将数据从缓冲区刷新到文件里，手动刷新缓冲区
        }
        bw.close();//关闭文件流对象，同样具有将数据刷新到文件里的作用
    }
}
