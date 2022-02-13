package Demo4;

import Demo3.User;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       序列化();
        反序列化();

    }
    public static void 反序列化() throws IOException, ClassNotFoundException {
        //1.想要读取文件中的内容恢复成内存中的user对象
        //反序列化：将磁盘中的数据恢复成内存中的对象的过程
        //反序列化（读）ObjectInputStream
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("day18/src/Demo4/db.txt"));
        //开始反序列化，边读边恢复成对象
        Object ob=ois.readObject();//一次读取一个对象
        if (ob instanceof  User){
            User u=(User)ob;
            System.out.println(u);
        }
    }
    public static void 序列化() throws IOException{
        User user=new User(1l,"admin","123");
        //user是java中的对象
        //对象的序列化将内存中的对象永久存在硬盘或者数据库中的过程（持久化）
        //序列化：对象字节输出流ObjectOutPutStream
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("day18/src/Demo4/db.txt"));
        //对象字节输出流
        objectOutputStream.writeObject(user);//写出对象到文件，使用对象流
        System.out.println("用户对象保存成功");
        objectOutputStream.flush();
        objectOutputStream.close();
        //保存失败，user对象没有序列化
    }
}
