package com.java.ConditionalStatement;

public class MarkStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark=101;
		
		if(mark==35)
		{
			System.out.println("E Grade");
		}
		
		else if(mark<35 & mark>=0)
		{
			System.out.println("Fail");
		}
		
		else if(mark>35 & mark<=50)
		{
			System.out.println("D Grade");
		}
		
		else if(mark>50 & mark<=70)
		{
			System.out.println("C Grade");
		}
		
		else if(mark>70 & mark<=80)
		{
			System.out.println("B Grade");
		}
		
		else if(mark>80 & mark<=90)
		{
			System.out.println("A Grade");
		}
		
		else if(mark>90 & mark<=100)
		{
			System.out.println("S Grade");
		}
		
		else
		{
			System.out.println("Please Check the mark");
		}
	}

}
