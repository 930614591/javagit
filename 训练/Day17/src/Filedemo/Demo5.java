package Filedemo;

import java.io.File;

public class Demo5 {
    public static void main(String[] args) {
        //删除一个文件夹
    }

    public static void deleteFile(File file){
        if(file==null || !file.exists()){
            //空指针，或者不存在
            System.out.println("当前文件夹中的文件不存在");
            return ;
        }
        //1.判断否是文件
        if (file.isFile()){
             file.delete();//直接删除
            return;
        }
        //2/删除文件夹中的对象（只有空文件夹才可以删除）

        File[] fileList=file.listFiles();
        for (File f:fileList
             ) {
            if (f.isFile()){
                f.delete();
            }else{//文件夹递归删除
                deleteFile(f);
            }

        }
        file.delete();//再此删除剩余的空文件夹

    }
}
