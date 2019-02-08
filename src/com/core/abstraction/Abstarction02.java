package com.core.abstraction;

interface abc {

	/*
	 * private void q(){ System.out.println("private method"); }
	 */

	static void w() {
		System.out.println("Abc");
	}

	void ff();
	/* protected void e(); */
}

interface xyz extends abc {

	public void asd();

	@Override
	void ff();

	static void w() {
		System.out.println("xyz");
	}

}


public class Abstarction02 implements xyz {

	@Override
	public void asd() {

	}

	@Override
	public void ff() {
		System.out.println("ff Abst");

	}
	
	static void w() {
		System.out.println("asb");
	}

	
	public static void main(String[] args)
	{
		xyz xx=new Abstarction02();
		abc aa=new Abstarction02();
		
		xx.ff();
		xx.asd();
		xyz.w();
		Abstarction02.w();
		aa.ff();
	
	}

}
