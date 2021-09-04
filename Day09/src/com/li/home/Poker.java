package com.li.home;

import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;

public class Poker {
	private String [] colorStrings= {"♥","♦","♣","♠"};//花色
	private String[] numStrings= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};//牌号
	private String[] pokerStrings=new String[54];
	private MyArray player1=new MyArray(17);
	private MyArray player2=new MyArray(17);
	private MyArray player3=new MyArray(17);
	private MyArray baseStrings=new MyArray(3);//底牌
	
	public String[] getPoperStrings() {
		return this.pokerStrings;
	}
	//初始化一副牌
	public void init() {
		System.out.println("买一副牌");
		int index=0;
		for(int i=0;i<numStrings.length;i++) {//外层循环点数
			for (int j = 0; j < colorStrings.length; j++) {
				//内层循环花色
				pokerStrings[index++]=colorStrings[j]+numStrings[i];//存入扑克牌
//				System.out.println(colorStrings[j]+numStrings[i]);
			}
			
		}
		pokerStrings[index++]="大王";
		pokerStrings[index++]="小王";
		
	}
	
	//kanpai看牌
	public void showPoker() {
		for (int i = 0; i < pokerStrings.length; i++) {
			System.out.print(pokerStrings[i]+"\t");
			if((i+1)%4==0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	//洗牌
	public void shuffle() {
		
		Random random=new Random();
		//随机数工具类，只需要创建一次
		
		
		for (int i = 0; i < pokerStrings.length; i++) {
			//随机获取一张poker的索引
			
			int index=random.nextInt(54);
			
			//实现初始位置和随机位置元素交换
			String tempString=pokerStrings[i];
			pokerStrings[i]=pokerStrings[index];
			pokerStrings[index]=tempString;
		}
	}
	
	//发牌
	public void dispatcher() {
		for (int i = 0; i < pokerStrings.length; i++) {
			if (i<pokerStrings.length-3) {//判断是否为底牌
				if(i%3==0) {
					player1.add(pokerStrings[i]);
				}else if (i%3==1) {
					player2.add(pokerStrings[i]);
				}else {
					player3.add(pokerStrings[i]);
				}
			}else {
				baseStrings.add(pokerStrings[i]);
			}
		}
		System.out.println("高进手牌"+Arrays.toString(player1.getString()));
		System.out.println("龙武手牌"+Arrays.toString(player2.getString()));
		System.out.println("华仔手牌"+Arrays.toString(player3.getString()));
		System.out.println("底牌"+Arrays.toString(baseStrings.getString()));
	}
	
	public static void main(String[] argStrings) {
		//demo();
		System.out.println("欢迎进入全民斗地主！");

		
		Scanner scanner=new Scanner(System.in);
		Poker poker=new Poker(); 
		
		while (true) {
			System.out.println("请玩家选择功能");
			System.out.println("\t 1.初始化");
			System.out.println("\t 2.洗牌");
			System.out.println("\t 3.看牌");
			System.out.println("\t 4.发牌");
			System.out.println("\t 0.结束游戏");
			int num=scanner.nextInt();
			
		
		switch (num) {
		case 1:
			poker.init();
			continue;
		case 2:
			poker.shuffle();
			continue;
		case 3:
			poker.showPoker();
			continue;
		case 4:
			poker.dispatcher();
			continue;
		case 0:
			System.out.println("宁德游戏已结束！");
			return;

		default:
			System.out.println("功能未开发！请重新选择");
			continue;
		}
		}
	}
	private static void demo() {
		Poker poker=new Poker(); 
		poker.init();
		poker.shuffle(); 
		poker.showPoker();
		poker.dispatcher();
		//System.out.println(Arrays.toString(poker.getPoperStrings()));
	}
}
