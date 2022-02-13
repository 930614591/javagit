package Filedemo;

import java.io.File;

public class Demo4 {
    public static void main(String[] args) {
        //1.统计文件大小
        File file=new File("");//指定一个目录或者文件
    }
    public static long getFileSize(File file){
        if (file==null || !file.exists()){
            return 0;//不存在就返回空
        }
        //1.需要判断是否是文件，若是就直接返回回文件大小
        if(file.isFile()){
            return file.length();
        }
        //。2.遍历当前文件下的所有文件
        long size=0;//文件的总大小
        File[] listFiles= file.listFiles();//获取到搜有的子文件对象（数组）
        for (File f:listFiles
             ) {
            if(f.isFile()){
                size+=f.length();
            }else{
                size+=getFileSize(f);
            }

        }
        return size;

    }
}
