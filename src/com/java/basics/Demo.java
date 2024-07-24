package com.java.basics;

public class Demo {
	
	int a=1000;//instance variable or instance global variable
	
	static int b=2000; // static global variable
	
	String trainerName;
	
	{
		int a=1;//local variable
	}

	public Demo() {
		int a=100;//local variable
	}
	
	public static void m1()
	{
		System.out.println("m1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
		int a=10;//local variable
		
		System.out.println("Hi");//sysout statement constructor,object,block,method,variable,class
	}

}
