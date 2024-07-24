package com.java.collection.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int --> Its not a Class
		//String ---> Its a Class
		ArrayList<Object> al=new ArrayList<Object>();
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
		
		for(int i=al.size()-1; i>=0; i--)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("=================");
		
//		Iterator<Object> i=al.iterator();
//		
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
//		ListIterator<Object> li = al.listIterator();
//		
//		while(li.hasNext())
//		{
//			System.out.println(li.next());
//		}
//		
//		System.out.println("=========================");
//		
//		while(li.hasPrevious())
//		{
//			System.out.println(li.previous());
//		}
		
	}

}
