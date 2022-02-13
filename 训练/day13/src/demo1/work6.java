package demo1;

import java.util.Scanner;

public class work6 {
    //7 控制台输入学号，将整数学号转换成字符串输出比如 123 输出 000123
    //n位数，不足的数填充0  “%0nd” 只能用0填充
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字：");

        long num=sc.nextLong();
        String format=String.format("工号：2021%05d",num);

        System.out.print(format);



}}
