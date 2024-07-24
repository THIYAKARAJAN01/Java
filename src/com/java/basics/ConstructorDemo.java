package com.java.basics;

public class ConstructorDemo {

	void m1()
	{
		System.out.println("I am M1");
		new ConstructorDemo();//object create
	}

	public ConstructorDemo() {

		System.out.println("I am Constructor");
	}
	
	static void m2()
	{
		new ConstructorDemo().m1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo constructorDemo=new ConstructorDemo();//object create
		
		constructorDemo.m1();
		
		m2();
	}

}
