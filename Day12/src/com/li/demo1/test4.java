package com.li.demo1;

public class test4 {
    public static void main(String[] args) {
        String str="qwe rty;";
        StringBuilder sb= new StringBuilder(str);
        String s2=sb+"123";
//        sb.append
        System.out.println(s2);
        String s3=sb.toString();
        System.out.println(s3);
    }
}
