package FileUtile;


import java.io.*;
import java.lang.String;

/*
 * 文本文件考虑使用字符流，（不需要太关注编码问题）
 * 多媒体文件（视频音频）使用字节流；（再复制文本时有可能因为缓冲区设置不当造成乱码问题）
 * 文本一律使用字符流，多媒体文件一律使用字节流处理
 * */
public class fileutil {
    public static void copyMedia(String oldFile,String newFile) throws IOException {
        if (oldFile==null || "".equals(oldFile)|| newFile==null || "".equals(newFile)){
            System.out.println("请传入正确的文件路径！");
            return;
        }
        //判断源文件和复制好的文件扩展名是否一致
        String suffixold=oldFile.substring(oldFile.lastIndexOf("."));
        String suffixnew=newFile.substring(oldFile.lastIndexOf("."));
        if (!suffixold.equals(suffixnew)){
            System.out.println("文件格式不正确！");
            return;
        }
        //1.判断路径的这个源文件是否存在
        File file=new File(oldFile);
        if (!file.exists()){
            System.out.println("源码文件不存在！");
            return;
        }

        //2.将原文件通过IO流读取
        FileInputStream fileInputStream=new FileInputStream(file);

        //3.创建最终写出流
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        //.4.开始复制（边读边写）
        int len=0;//读到的字节的实际值
        while ((len=fileInputStream.read())!=-1){
            fileOutputStream.write(len);//读一个写一个太浪费时间
        }
        System.out.println("恭喜复制成功！");

        //5.释放资源
        fileOutputStream.close();
        fileInputStream.close();
    }
}
