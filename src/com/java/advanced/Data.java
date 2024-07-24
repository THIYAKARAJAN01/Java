package com.java.advanced;

public class Data {

	public static void add()
	{
		int a=10;
		
		int b=20;
		
		System.out.println(a+b);
	}
	
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(float a,float b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(213.345f,23423.567f);
		add();
		add();
		add();
		
		add(1,2);
		add(10,20);
		add(100,200);
		add(1000,2000);
		add(24,54);
	}

}
