package com.core.inner;

public class Outer {

	private void abc()
	{
		System.out.println("Outer's abc");
	}
	
	public void show()
	{
		System.out.println("Outer's Show");
	}
	
	protected void print()
	{
		System.out.println("Outer's Print");
	}
	
	static void xyz()
	{
		System.out.println("Static Xyz");
	}
	
	class Inner
	{
		private void abc()
		{
			System.out.println("Inner's abc");
		}
		
		
	}
	



}

