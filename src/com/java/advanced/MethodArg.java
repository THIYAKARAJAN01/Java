package com.java.advanced;

import java.util.Scanner;

public class MethodArg {

	public static void m1(String data)
	{
		int a=10;
		
		int b=20;
		
		System.out.println(a+b);
	}
	
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void addition()
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter the Data 1:: ");
		int data1=scanner.nextInt();
		
		System.out.println("Please enter the Data 2:: ");
		int data2=scanner.nextInt();
		
		System.out.println("This is the addition of Data 1 and Data 2 === "+(data1+data2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition();
	}

}
