package demo1;

import java.util.Scanner;

public class work5 {
    //6、控制台输入金额，转换成字符串输出
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入银行卡金额：");

        long money=sc.nextLong();
        String format=String.format("￥%,d",money);

        System.out.print(format);



}}
