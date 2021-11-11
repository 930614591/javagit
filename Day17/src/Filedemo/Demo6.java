package Filedemo;

import java.io.File;

public class Demo6 {
    public static void main(String[] args) {
        //1.获取文件的路径
        File file=new File("");
        System.out.println(file.length()/1024/1024+"MB");//计算出文件的大小
        System.out.println(file.getPath());//获取文件的相对路径
        System.out.println(file.getAbsolutePath());//获取文件的绝对路径
    }
}
