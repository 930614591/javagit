package homework.mapDemo;

import java.util.HashMap;

public class test3 {
    public static void main(String[] args) {
        //场景通过学号找到学生
        Student s1=new Student(1001l,"张三",68);
        Student s2=new Student(1002l,"李四",78);
        Student s3=new Student(1003l,"王五",88);
        // 请帮我从一些学生信息中查找1003这个学生是否存在

        HashMap<Long,Student> map=new HashMap<>();
        map.put(s1.getId(),s1);
        map.put(s2.getId(),s2);
        map.put(s3.getId(),s3);

        System.out.println(map.containsKey(1003l));
    }
}
