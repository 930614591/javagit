package Filedemo;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //1.给出一个任意文件路径，来创建这个文件（若文件夹不存在则先创建文件夹在创建文件）
        String path="D:/java10测试用例/文件操作/test.txt";
        int index=path.lastIndexOf("/");
        String dirpath=path.substring(0,index);
        String filename=path.substring(index+1);
        System.out.println(path);
        System.out.println(filename);

        //1.构建需要创建的文件夹对象
        File dir=new File(dirpath);

        if(!dir.isFile()){
            dir.mkdirs();//创建多级文件夹目录
        }

        //2.构建一个文件对象
        File file=new File(dir,filename);
        //判断文件夹否存在
        if (!file.exists()) {
            file.createNewFile();//创建文件

        }



        /*File file=new File(path);
        //2.判断当前路径所在的文件或者文件夹的文件对象是否存在
        if (!file.exists()){
            System.out.println("当前路径所在的文件夹中的文件不存在,请稍等，正在创建对象：");
            //3.判断文件对象到底是文件对象还是文件夹
            if (file.isFile()){
                //判读那是否是文件
                try {
                    file.createNewFile();//创建文件
                } catch (IOException e) {
                    System.out.println("文件创建失败");
                    e.printStackTrace();

                }
            }else{
                //是文件夹
                file.mkdirs();
            }
            return;
        }
*/

    }
}
