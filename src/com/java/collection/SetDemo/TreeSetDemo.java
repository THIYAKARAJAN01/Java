package com.java.collection.SetDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Object> hs=new TreeSet<Object>();
		
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(1450);
		hs.add(12350);
		hs.add(176570);
		hs.add(10567);
		hs.add(10745);
		hs.add(1460);
		hs.add(10456);
		hs.add(14560);
		hs.add(1057);
		hs.add(18900);
		hs.add(1068);
		hs.add(10);
		hs.add(10);
		
		for(Object aa:hs)
		{
			System.out.println(aa);
		}
		System.out.println("============================");
		
		Iterator<Object> di=hs.descendingIterator();//return type save it in variable name
		
		while(di.hasNext())
		{
			System.out.println(di.next());
		}
	}

}
