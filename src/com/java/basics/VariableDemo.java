package com.java.basics;

public class VariableDemo {

	String trainerName="Logeshwaran";
	static VariableDemo obj;
	public static void batch1()
	{
		obj=new VariableDemo();
		System.out.println("Trainer Name of Batch - 1 :: "+obj.trainerName);
	}
	
	public static void batch2()
	{
		System.out.println("Trainer Name of Batch - 2 :: "+obj. trainerName);
	}
	
	public static void batch3()
	{
		System.out.println("Trainer Name of Batch - 3 :: "+obj.trainerName);
	}
	
	public static void batch4()
	{
		obj.trainerName="Gowri";
		System.out.println("Trainer Name of Batch - 4 :: "+obj.trainerName);
	}
	
	public static void batch5()
	{
		System.out.println("Trainer Name of Batch - 5 :: "+obj.trainerName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		batch1();
		batch2();
		batch3();
		batch4();
		batch5();
		
		MethodCalling mc=new MethodCalling();
		mc.m4();
		
		
	}

}
