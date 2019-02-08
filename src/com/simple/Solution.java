package com.simple;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;
import java.io.*;

public class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
      Map m=new HashMap();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
          m.put(name,phone);
          
          
		}
//		while(in.hasNext())
//		{
//			String s=in.nextLine();
//          if(m.containsKey(s)){
//              System.out.println(s+"="+m.get(s));
//          }
//          else
//          {
//              System.out.println("Not found");
//          }
//		}
		
		for(int i=0;i<n;i++)
		{
		Stream<Map> stream = Stream.of(m);

		String s=in.nextLine();

		stream.parallel().forEach(p -> {
			if(p.containsKey(s))
				System.out.println(s+"="+p.get(s));
			else
				System.out.println("Not found");
		});
		}
	}
}



