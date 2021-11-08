package demo3;

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        //需求：在D：/笔记三中创建一个baidu.txt
        //String str="d:\\笔记2\\baidu.txt";
        //创建父文件夹对象(将文件夹和文件分离)
        File dir=new File("d:\\笔记3\\测试");
        if ( !dir.exists()){
            //当这个文件对象是文件夹并且不存在的时候，需要我们手动创建出来
            dir.mkdirs();//创建出来 可以创建多级文件夹
        }
        File file=new File(dir,"baidu.txt");
        if(!file.exists()){
            //判断，只有没有文件的时候才创建
            try {
                file.createNewFile();//创建文件
            } catch (IOException e) {//处理异常
                System.out.println("文件创建失败，文件夹不存在！");
                e.printStackTrace();
            }
        }
    }
}
