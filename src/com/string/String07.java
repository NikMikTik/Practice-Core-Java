package com.string;

import java.util.Scanner;

public class String07 {
	int ii;
	int jj;
	String str;

	
	public String07(int ii, String str, int jj) {
		this.ii = ii;
		this.jj = jj;
		this.str = str;
	}
	public String07() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String sentence;
		System.out.println("Enter Sentence");
		Scanner sc = new Scanner(System.in);
		sentence = sc.nextLine();
		String[] word = sentence.split(" ");
		String xyz="";
		for (String string : word) {
			System.out.println("----" + string + "----");
			int count = 0;
			count = string.length() - 1;
			System.out.println("-----" + count + "-----");
			String abc = "";
			/*int i;
			i=count;*/
			int j=0;
			String08 ss=new String08();
			ss.ii=count;
			ss.str=string;
			ss.jj=j;
			String08 sss=func(ss);
			
			xyz+=sss.str+" ";
		}
		xyz=xyz.substring(0, xyz.length()-1);
		System.out.println(xyz);
	}
public static String08 func(String08 ss)
{String abc="";
	if((char)(ss.str.charAt(ss.jj)+ss.ii)>'z')
	{
	char[] hjhj=ss.str.toCharArray();
		abc+=(char)((ss.str.charAt(ss.jj))-(26-ss.ii));
		char b=abc.charAt(0);
		hjhj[ss.jj]=b;
		ss.str=String.valueOf(hjhj);
	}
	else
	{
		char[] hjhj=ss.str.toCharArray();
		hjhj[ss.jj]=(char)(ss.str.charAt(ss.jj)+ss.ii);
		ss.str=String.valueOf(hjhj);
		

		
	}
	ss.ii=ss.ii-1;
	
	ss.jj=ss.jj+1;
	if(ss.ii>=0)
	{
	return func(ss);}
	else return ss;
	
}
}
