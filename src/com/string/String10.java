package com.string;

import java.util.Scanner;

/*Enter Sentence
yum feed is very good
good very is feed yum
*/

public class String10 {

	public static void main(String[] args) {

		String abc="";
		System.out.println("Enter Sentence");
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		String[] words=sentence.split(" ");
		int i=words.length;
		for(int k=i-1;k>=0;k--)
		{
			abc+=words[k]+" ";
		}
		abc=abc.substring(0, abc.length()-1);
		System.out.println(abc);
	}

}
