package com.core.abstraction;

public class ExtendedAgain extends Extended{
	public void method0(){}

	public ExtendedAgain() {
		System.out.println("ExtendedAgain Constructor Called");
	}
	@Override
	public void method2() {
		System.out.println("Running in ExtendedAgain Method 2");		
		
	}

	@Override
	public void method1() {
		super.method1();
		System.out.println("Running in ExtendedAgain Method 1");		
		
	}
	
	@Override
	public void method3() {
		super.method3();
		System.out.println("Running in ExtendedAgain Method 3");		
		
	}
	


}
