package com.java.arrayDemo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array literals
		int []a= {
				
				1,
				2,
				3,
				4,
				5,
				6,
				7,	
		};
		
		//using new keyword without using size
		int m[]=new int[] {
				1,
				2,
				3,
				4,
				5,
				6,
				7,
				8,
				9,
				10};

		//literals
		Object obj[]= {1,125.754f,'s',83645746354657L,378456347865473584.3456,"java",true};
		
		//using new keyword
		int data[]=new int[10000];//fix the size
		
		data[0]=476;
		
		data[1]=475;
		
		for(int dd:data)
		{
			System.out.println(dd);
		}
		
		System.out.println("====================");
		
		for(Object aa:obj)
		{
			System.out.println(aa);
		}
	}

}
