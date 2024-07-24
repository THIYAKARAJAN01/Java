package com.java.basics;

public class Variables {

	int a=10;

	static int b=20;

	public static void m1()
	{
		int a=1;

		int b=2;

		System.out.println(a);

		System.out.println(b);
		
		System.out.println(new Variables().a);

		System.out.println(Variables.b);
	}

	public void m2()
	{
		int a=3;

		int b=4;

		System.out.println(a);

		System.out.println(b);
		
		System.out.println(this.a);

		System.out.println(Variables.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
		
		new Variables().m2();

	}

}
