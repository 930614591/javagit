package com.li.home3;

import java.util.Arrays;
import java.util.Random;

public class RandomTools {
	//产生四位验证码
	public String getRandom4Colde() {
		Random random=new Random();
		String str="";
		for (int i = 0; i < 4; i++) {
			str+=random.nextInt(10);
		}
		return str;
	}
	
	public String getRandom4Number() {
		Random random=new Random();
		String str="";
		
		str+=random.nextInt(9000)+1000;
		
		return str;
	}
	
	public String getRandom6Colde() {
		//六位随机验证码 数字字母
		char[] ch=new char[62];
		int index=0;
		for (char i = 'a'; i <= 'z'; i++) {
			ch[index++]=i;
			//System.out.println(i);
		}
		for (char i = '0'; i <= '9'; i++) {
			ch[index++]=i;
			//System.out.println(i);
		}
		for (char i = 'A'; i <= 'Z'; i++) {
			ch[index++]=i;
			//System.out.println(i);
		}
		//System.out.println(Arrays.toString(ch));
		//产生一个六位随机验证码
		Random random=new Random();
		String coeString="";
		for (int i = 0; i < 6; i++) {
			int num=random.nextInt(62);
			coeString+=ch[num];
			
		}
		return coeString;
		
	}
	
	public static void main(String[] args) {
		RandomTools randomTools=new RandomTools();
		//String r4=randomTools.getRandom4Colde();
		//String r42=randomTools.getRandom4Number();
		String r6=randomTools.getRandom6Colde();
		//System.out.println(r4);
		//System.out.println(r42);
		System.out.println(r6);
	}
}
