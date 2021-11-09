package demo3;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        //1.计算文件和文件夹的大小
        File file=new File("d:\\bd");
        fileutil fileutil=new fileutil();
        long l=fileutil.getFileSize(file);
        System.out.println(l);
     }
}
