package com.oops.abstractionInterDemo;

public class Demo implements InterDemo1,InterDemo2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void currency() {
		System.out.println("This is Currency");
		
	}

	@Override
	public void csr() {
		System.out.println("CSR");
		
	}

	@Override
	public void m1() {
		System.out.println("m1");
		
	}

	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	@Override
	public void add() {
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		
	}

	@Override
	public void sub() {
		int a=10;
		int b=20;
		System.out.println(b-a);
		
	}

}
