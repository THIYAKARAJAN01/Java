package com.java.advanced;

public class ParameterDemo {

	int a=10;
	
	public ParameterDemo() {
		this(10);
		System.out.println("No argument Constructor");
		System.out.println(this.a);
	}

	public ParameterDemo(int a) {
		this('s');
		System.out.println("Int argument Constructor");
	}

	public ParameterDemo(char a) {
		this("");
		System.out.println("Char argument Constructor");
	}

	public ParameterDemo(String a) {
		this(10.747F);
		System.out.println("String argument Constructor");
	}

	public ParameterDemo(float a) {
		System.out.println("Float argument Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ParameterDemo();
		
	}

}
