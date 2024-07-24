package com.oops.abstractionInterDemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterDemo d=new Demo();
		d.csr();
		d.currency();

		InterDemo1 d1=new Demo();
		d1.m1();
		d1.m2();
		d1.csr();
		d1.currency();
		
		InterDemo2 d2=new Demo();
		d2.add();
		d2.sub();
		d2.csr();
		d2.currency();
		
		
		Demo demo=new Demo();
		demo.currency();
		demo.csr();
		demo.m1();
		demo.m2();
		demo.add();
		demo.sub();
		
		
	}

}
