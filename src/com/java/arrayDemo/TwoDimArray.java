package com.java.arrayDemo;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[row][column]
		int [][]a={
				{1,2},
				{3,4},
				{5,6},
				{7,8,100,200,300,400},
				{9,10},
				{11,12},
				{13,14},
				{15,16}
		};
		
		for(int aa[]:a)
		{
			for(int bb:aa)
			{
				System.out.print(bb+",");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		System.out.println(a.length);//row
		
		System.out.println(a[3].length);//column
		
		for(int i=0; i<=a.length-1; i++)//0 1 2 3 4 5 6 7
		{
			for(int j=0; j<=a[i].length-1;j++)// 2,2,6,2,2,2,2 0 1, 0 1, 0 1 2 3 4 5, 0 1
			{
				System.out.print(a[i][j]+",");
			}
			System.out.println();
		}
		
//		int c[][][]=new int[][][] {
//			{
//				{},
//				{},
//				{},
//			},
//			{
//				{},
//				{},
//				{},
//			},
//			{
//				{},
//				{},
//				{},
//			}
//		};
	}

}
