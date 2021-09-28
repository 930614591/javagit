package array.ListDemo;

import java.util.ArrayList;

public class studenttest {
    public static void main(String[] args) {
        //1、创建五个学生
        StuDent s1=new StuDent(1,"张飞",98);
        StuDent s2=new StuDent(1,"张飞",98);
        //判断两个对象是否相同，首先判断地址。其次判断equals
        int h1=s1.hashCode();//hashCode就是地址
        int h2=s2.hashCode();

        //2、创建一个班级数组
        ArrayList<StuDent> list =new ArrayList<StuDent>();
        list.add(s1);
        //1、对象的循环遍历用foreach
        for (StuDent sd:list) {//其中的sd是一个局部变量，每次用来接收返回的遍历对象的
            sd.stu();

        }
    }
}
