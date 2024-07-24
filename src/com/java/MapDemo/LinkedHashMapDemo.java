package com.java.MapDemo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap hm=new LinkedHashMap();
		
		hm.put(100, "admin");
		hm.put(101, "tester");
		hm.put(102, "balaji");
		hm.put(103, "arun");
		hm.put(104, "maven");
		hm.put(105, "Java");
		hm.put(null, "testng");
		hm.put(106, "Selenium");
		hm.put(107, "data");
		hm.put(108, "rila");
		hm.put(109, "nishanth");
		
		System.out.println(hm);
		
		Set keys = hm.keySet();
		
		Collection values = hm.values();
		
		Set entires = hm.entrySet();
		
		System.out.println(keys);
		
		System.out.println(values);
		
		System.out.println(entires);
	}

}
