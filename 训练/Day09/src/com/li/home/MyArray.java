package com.li.home;

public class MyArray {
	private int capacity=10;//数组的初始容量为10容量
	private String[] string=null;
	private int index=0;
	
	public String[] getString() {
		return this.string;
	}
	
	public MyArray() {
		super();
		string =new String[capacity];
	}
	
	
	public MyArray(int capacity) {
		super();
		this.capacity =capacity;
		string =new String[capacity];
	}
	
	public void add(String valueString) {
		if (index<string.length) {
			string[index++]=valueString;
		}
		
		
	}
}
