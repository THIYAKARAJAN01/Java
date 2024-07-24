package com.java.ExceptionDemo;

public class Test {

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
			System.out.println("Please Enter Non Zero Numbers");
		}

		finally
		{
			//System.out.println("Always Executable");
			System.out.println("Thanks for using our calculator appplication");
		}
		
		
	}

}
