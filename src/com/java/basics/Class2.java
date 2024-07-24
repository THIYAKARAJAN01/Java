package com.java.basics;

public class Class2 {

	public static void m1()
	{
		System.out.println(1);
	}
	public void m2()
	{
		System.out.println(2);
	}
	public void m3()
	{
		System.out.println(3);
	}
	public void m4() 
	{
		System.out.println(4);
	}
	public void m5()
	{
		System.out.println(5);
	}
	
	public static void data()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		
		short b=32767;
		
		System.out.println(b);
		System.out.println(b);
		System.out.println(b);
		System.out.println(b);
		System.out.println(b);
		System.out.println(b);
		
		
		Class2.data();
		Class2.m1();
		
		Class2 obj=new Class2();
		
		new Class2();//nameless Object
		
		obj.m2();
		obj.m3();
		obj.m4();
		obj.m5();
		Class2.data();
	}
}
