package com.java.arrayDemo;

public class OneDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[];
		
		int[] b;
		
		int []c;
		
		int data[]= {1,2,3,4,5,6,7,8,9,10};//literal way
		
		//10 elements store --- works on index bases 0 1 2 3 4 5 6 7 8 9
		int num[]=new int[10];//using new keyword
		
		for(int i=0; i<=data.length-1;i++)
		{
		System.out.println(data[i]);
		}
		
		System.out.println("========================");
		
		for(int i=data.length-1; i>=0;i--)
		{
		System.out.println(data[i]);
		}
	}

}
