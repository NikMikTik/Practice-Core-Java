package com.core.abstraction;

public abstract class Abstract implements Interface{

	Abstract(){
		System.out.println("Abstract Constructor Called");
	}
	public abstract void method1();

	public abstract void method2();

	public void method3()
	{
		System.out.println("Abstract Method 3 Called");
	
	}
}
