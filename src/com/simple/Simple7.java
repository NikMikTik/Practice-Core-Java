package com.simple;

import java.util.Scanner;

public class Simple7 {

	public static void main(String[] args) {

		System.out.println("Enter Time Hrs:Mins");
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		String[] t = time.split(":");
		int hrs = Integer.parseInt(t[0]);
		int min = Integer.parseInt(t[1]);
		int hrVal = degreeHr(hrs, min);
		System.out.println(hrVal);
		int minVal = dregreeMin(min);
		System.out.println(minVal);
		int x = (hrVal - minVal);
		x = (x < 0 ? -x : x);
		System.out.println("Angle Between Hrs and Min is: " + x + " degrees");
	}

	private static int dregreeMin(int min) {

		return min * 6;
	}

	private static int degreeHr(int hrs, int min) {
		// TODO Auto-generated method stub
		return ((hrs * 60 + min) / 2);
	}

}
