package com.java.collection.ListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int --> Its not a Class
		//String ---> Its a Class
		

		LinkedList<Object> al=new LinkedList<Object>();
		al.add(10.56345F);
		al.add(null);
		al.add(10.56345F);
		al.add(10.56345F);
		al.add(10.56345F);
		al.add(10.56345F);
		al.add(283674783434340L);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(true);
		al.add('s');
		al.add("java");
		al.add(null);
		al.add(50);
		
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("============================");
		
		Iterator<Object> di=al.descendingIterator();//return type save it in variable name
		
		while(di.hasNext())
		{
			System.out.println(di.next());
		}
	}

}
