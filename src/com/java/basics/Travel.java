package com.java.basics;

public class Travel {

	public void place()
	{
		
	}
	
	public void days()
	{
		
	}
	
	public void stay()
	{
		
	}
	
	public Travel() {
		System.out.println("Choose the Place");
		System.out.println("Choose the Days Count");
		System.out.println("Choose the Staying area");
	}
	
	public Travel(int travelPersonCount) {
		System.out.println("book the ticket per head");
		System.out.println("Choose the Place");
		System.out.println("Choose the Days Count");
		System.out.println("Choose the Staying area");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Travel t=new Travel(10);
		t.place();
		t.days();
		t.stay();
	}

}
