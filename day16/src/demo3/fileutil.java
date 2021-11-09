package demo3;

import java.io.File;

/*
*
* 递归统计文件及文件大小的
* file 文件路径
* 文件大小（baty）
* */
public class fileutil {
    public static long getFileSize(File file){
        if(file==null || "".equals(file)) return 0l;
        //1.创建一个文件对象
       // File file=new File(filepath);
        //2.判断这文件对象是否存在
        /*if (!file.exists()){
            return 0;
        }*/
        //1。当时文件的时候直接返回大小，若是文件夹则
        if (file.isFile()){
            return file.length();//递归结束条件
        }
        //2。如果是文件夹，获取所有的文件对象
        File[] listFile= file.listFiles();//获取当前file路径下的所有子文件对象
        //3.使用递归来统计文件夹的大小
        long size=0;
        for (File f:listFile ) {
            if (f.isFile()){
                //判断子文件对象是不是文件
                size+=f.length();
            }else{
                //不是文件就一定是文件夹（文件夹是没有大小的length（）长度为0）
                size+=getFileSize(f);//递归调用本身
            }
        }

        return size;
    }

}
