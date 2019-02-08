package com.string;

import java.util.Scanner;

public class String09 {

/*	Enter Sentence
	yum feed is very good
	---yumfeedisverygood---
*/
	
	public static void main(String[] args) {

		String str = "";
		System.out.println("Enter Sentence");
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		String[] word=sentence.split(" ");
		for (String string : word) {
			str+=string;
		}
		System.out.println("---"+str+"---");
	}

}
