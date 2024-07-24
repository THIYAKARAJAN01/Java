package com.java.ExceptionDemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		
		int b=0;
		
		try
		{
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
