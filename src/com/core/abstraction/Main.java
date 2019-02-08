package com.core.abstraction;

public class Main {

	public static void main(String[] args) {

		Abstract aa= new ExtendedAgain();
		aa.method1();
		System.out.println("--------------------------------------------");
		Abstract aaa= new ExtendedAgain();
		aaa.method2();
		System.out.println("--------------------------------------------");
		Abstract aaaa= new ExtendedAgain();
		aaaa.method3();	
		System.out.println("---------------------**-----------------------");
		aaaa.method2();
		System.out.println("--------------------------------------------");
		ExtendedAgain ee= new ExtendedAgain();
		ee.method3();
		System.out.println("----------------------**----------------------");
		ee.method2();
		
		
	}

}
