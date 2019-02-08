package com.string;

import java.util.Scanner;

public class String0 {

/*	
	Enter s for next()
	c c++ c++++ c++++++
	------c
	------c++
	------c++++++
	Enter s for nextLine()
	c c++ c++++ c++++++
	------c c++ c++++ c++++++

*/
	public static void main(String[] args) {

		int n;
		String s, ss;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s for next()");
		s = sc.next();
		System.out.println("------" + s);
		s = sc.next();
		System.out.println("------" + s);
		s = sc.next();
		s = sc.next();
		System.out.println("------" + s);

		Scanner scc = new Scanner(System.in);
		System.out.println("Enter s for nextLine()");
		ss = scc.nextLine();
		System.out.println("------" + ss);

	}
}
