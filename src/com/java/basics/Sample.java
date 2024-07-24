package com.java.basics;

public class Sample 
{

	//constructor
	public Sample() {
		System.out.println("I am Constructor");
	}
	
	//instance block
	{
		System.out.println("I am Instance block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=0;
		
		while(i<=10)
		
		{
			System.out.println(i);
			i++;
		}
		
	}
	
	
}
