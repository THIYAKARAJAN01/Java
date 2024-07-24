package com.java.ExceptionDemo;

public class RunTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[]= {0,1,2,3,4,5,6,7,8};
		
		int a=10;
		
		int b=0;
		
		try
		{
		System.out.println(data[13]/b);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Please Give Non Zero Numbers");
		}
		
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Please Check the Array Size");
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Please Check the Exception");
		}
		
		
	}

}
