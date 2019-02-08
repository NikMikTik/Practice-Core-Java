package com.string;

import java.util.Scanner;

public class String03 {

/*

	Enter T
	2
	Enter A
	FEDSTFJGLIUKJHJBNCBXZDAEEQWQETT
	Holes in Text9
	Enter A
	NMBNBNVBVBBCVVXCZXSADSFDGFDFHGJHGKHLJLJOPIPIOUIOYIUYUTYYRTERTERWEQEW
	Holes in Text23

*/
	
	public static void main(String[] args){
		
		int T,count=0;
		String A;

		System.out.println("Enter T");
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();

		for(int i=0;i<T;i++){
			count=0;
			Scanner scc=new Scanner(System.in);
			System.out.println("Enter A");
			A=scc.next();
			A=A.toUpperCase();
			for(int j=0;j<A.length()-1;j++)
			{
				switch(A.charAt(j)){
				case 'A':count++; break;
				case 'B':count=count+2; break;
				case 'D':count++; break;
				case 'O':count++; break;
				case 'P':count++; break;
				case 'Q':count++; break;
				case 'R':count++; break;
				}
			}
			System.out.println("Holes in Text"+count);
		}
		
	}

}
