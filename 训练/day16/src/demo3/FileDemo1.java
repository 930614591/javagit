package demo3;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //1.创建一个文件对象
        String pathname="day16\\1.txt";//文件在磁盘中的路径  或  在岗前工程中的路径
        File file=new File(pathname);//此处放一个路径,通过路径来创建文件对象
        System.out.println(file.toString());//file重写了ToString方法，调用getPath
        //1.判断此路径下文件是否存在
        if(file.exists()){
            System.out.println("文件找到了");
            if(file.isFile()){
                System.out.println("文件对象是一个文件");
            }else if(file.isDirectory()){
                System.out.println("文件对象是一个文件夹");
            }
        }else{
            System.out.println("文件没有找到");
        }

        //3.插卡文件的大大小，文件夹默认没有大小0，
        long size=file.length();
        System.out.println("文件大小："+size+"byte");

    }
}
