package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class File01 {

	public static void main(String[] args) throws IOException {
		  HashSet<String> set1=new HashSet<>();
		  HashSet<String> set2=new HashSet<>();
		  HashSet<String> ss=new HashSet<>();

		  File file1 = new File("D:\\abc.txt");
		  File file2 = new File("D:\\xyz.txt");
		  
		  FileWriter writer1 = new FileWriter(file1);
		  FileWriter writer2 = new FileWriter(file2);
		  
	      writer1.write("Test Google, LLC is an American multinational technology company that specializes in Internet-related services and products, which include online advertising data");
	      writer1.close();

	      writer2.write("Test YouTube, LLC is an American video-sharing website headquartered in San Bruno, California. Three former PayPal  that employees—Chad Hurley, Steve Chen, and data");
	      writer2.close();
	      
		Scanner input1=new Scanner(file1);
		Scanner input2=new Scanner(file2);

		input1.useDelimiter(" +"); //delimitor is one or more spaces

		while(input1.hasNext()){
		   String str=input1.next();
			set1.add(str.toLowerCase());
		}
		input1.close();
		
		input2.useDelimiter(" +"); //delimitor is one or more spaces
		System.out.println(input2);

		while(input2.hasNext()){
			  String str=input2.next();
				set2.add(str.toLowerCase());
		}
		input2.close();
		
		for (String string : set2) {
			if(set1.contains(string))
			{
				ss.add(string);
			}
		}
		System.out.println("---------------------\n"+ss);
		
	}

}
