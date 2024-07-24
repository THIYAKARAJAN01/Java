package com.java.collection.ListDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int --> Its not a Class
		//String ---> Its a Class
		
		Vector<Object> al=new Vector<Object>();
		al.add(10.56345F);
		al.add(10.56345F);
		al.add(10.56345F);
		al.add(10.56345F);
		al.add(10.56345F);
		al.add(null);
		al.add(283674783434340L);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(true);
		al.add('s');
		al.add("java");
		al.add(null);
		al.add(50);
		
		al.remove(0);
		
		al.add(3,"selenium");
		System.out.println(al);
		
		al.remove("selenium");
		System.out.println(al);
		
		Enumeration<Object> e = al.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
