package com.li.demo1;

public class Test1 {

    public static void main(String[] args) {
        String s1="123";
        String s2="123";
        int num=123;
        long number=123l;
        //String 重写了Object中的equals，比较的是两字符串的内容
        s1.equals(s2);
        s1.equals(123);
        //八大基本类型不属于Object子对象，属于特殊类型
        Test1 t1=new Test1();
        Test1 t2=new Test1();
        t1.equals(t2);
        t1.equals(12);
        t1.equals(13.0);
    }
}
