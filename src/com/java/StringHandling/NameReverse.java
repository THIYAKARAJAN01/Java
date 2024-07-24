package com.java.StringHandling;

public class NameReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		String name="Vijaya  Kumar";
		
		System.out.println(name.length());
		
		int nameSize=name.length()-1;
		
		for(int i=0; i<=nameSize; i++)
		{
			System.out.print(name.charAt(i));
		}
		System.out.println();
		System.out.println("===========================");
		for(int i=nameSize; i>=0; i--)
		{
			System.out.print(name.charAt(i));
		}
	}

}
