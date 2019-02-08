package com.string;

import java.util.Scanner;

public class String11 {

/*	Enter Sentence
	yum feed is very good
	muy deef si yrev doog
*/	
	
	public static void main(String[] args) {
String sstre="";
		System.out.println("Enter Sentence");
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		String[] words=sentence.split(" ");
		for (String string : words) {
			String str = "";
			char[] abc=string.toCharArray();
			int i=abc.length-1;
			for (int j = i; j >=0; j--) {
				str+=abc[j];
				
			}
			sstre+=str+" ";
		}
		sstre=sstre.substring(0,sstre.length()-1);
		System.out.println(sstre);
	}

}
