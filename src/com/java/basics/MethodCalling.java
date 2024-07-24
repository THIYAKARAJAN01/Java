package com.java.basics;

public class MethodCalling {

	//static
	public static void m1()
	{
		System.out.println("m1");
		new MethodCalling().m4();
	}
	
	//static
	public static void m2()
	{
		System.out.println("m2");
	}
	
	//instance
	public void m3()
	{
		System.out.println("m3");
		m2();
	}
	
	//instance
	public void m4()
	{
		System.out.println("m4");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
		new MethodCalling().m3();
		new MethodCalling().m4();
	}

}
