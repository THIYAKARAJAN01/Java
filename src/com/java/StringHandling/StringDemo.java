package com.java.StringHandling;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringDemo sd=new StringDemo();
		

		String s1="java"; //Object Creation (without using new keyword we can create object for String class)
		
		String s2=new String("java");//Object Creation
		
		System.out.println(s1.hashCode());
		
		System.out.println(s2.hashCode());
		
		System.out.println(s1.length());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.replace('a', 'e'));
		
		System.out.println(s1.charAt(0));
		
		System.out.println(s1.indexOf('a'));
		
		System.out.println(s1.lastIndexOf('a'));
		
		System.out.println(s1);
		
		System.out.println(s1.concat(" programming"));
		
		
	}

}
