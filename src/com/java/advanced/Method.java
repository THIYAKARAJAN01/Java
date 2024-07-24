package com.java.advanced;

public class Method {

	public void m1()
	{
		System.out.println("M1");
		m2();
	}
	public void m2()
	{
		System.out.println("M2");
		m3();
	}
	public void m3()
	{
		System.out.println("M3");
		m4();
	}
	public void m4()
	{
		System.out.println("M4");
		m5();
	}
	public void m5()
	{
		System.out.println("M5");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method m=new Method();
		m.m1();
	}

}
