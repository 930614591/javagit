package com.li.home3;

import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
			
		
		System.out.println("欢迎进入猜拳游戏！");
		System.out.println("1、剪刀");
		System.out.println("2、石头");
		System.out.println("3、布");
		System.out.println("0、结束游戏");
		while (true) {
		System.out.println("请玩家出拳");
		Scanner scanner=new Scanner(System.in);
		int temp=scanner.nextInt();
		if (temp==0) {
			System.out.println("游戏已结束");
			return;
		}
		//电脑随机数
		Random random=new Random();
		int computer=random.nextInt(3)+1;
		
		if(temp<=3&&temp>=1) {
			String tm1 = null;
			String tm2 = null;
			if(temp==1) {tm1="剪刀";}
			if(temp==2) {tm1="石头";}
			if(temp==3) {tm1="布";}
			if(computer==1) {tm2="剪刀";}
			if(computer==2) {tm2="石头";}
			if(computer==3) {tm2="布";}
			System.out.println("玩家出:"+tm1+"\t电脑出:"+tm2);
		if ((temp==2&&computer==1)||(temp==1&&computer==3)||(temp==3&&computer==2)) {
			System.out.println("玩家赢");
			}
		if ((computer==2&&temp==1)||(computer==1&&temp==3)||(computer==3&&temp==2)) {
			System.out.println("电脑赢");
			}
		if (temp==computer) {
			System.out.println("你们是平局");
			}}else {
				System.out.println("请正确出拳！");
			}
	}}
}
