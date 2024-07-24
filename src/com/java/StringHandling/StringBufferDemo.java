package com.java.StringHandling;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringBuffer sb=new StringBuffer("selenium");
		
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		System.out.println(sb.replace(0, 4, "sala"));
		
		System.out.println(sb.append(" webdriver"));
		
		System.out.println(sb.reverse());
		
		System.out.println(sb);
	}

}
