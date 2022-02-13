package com.li.demo;

import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1,xx=0;i<=35;i++,xx=0) {
			for (int j = 2; j < i; j++) {
				if(i%j==0) {
					xx++;
				}	
			}
			 if(xx==0) {//是素数
				System.out.print(i+"\t");//输出并加四个空格	
			}
			
		}
	}

}
