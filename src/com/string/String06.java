package com.string;

public class String06 {

/*	
	-----yum-----
	-----feed-----
	avm igfd
*/
	
	
	public static void main(String[] args) {
		String a = "yum feed abc gef hij nbm";
		String encrypted = "";
		String[] splitOnWhiteSpace = a.split(" ");
		for (String word : splitOnWhiteSpace)
		{
			System.out.println("-----"+word+"-----");
			int count = word.length() - 1;
			
			for (int i = 0; i <= word.length() - 1; i++) 
			{
				
				char c = (char) (word.charAt(i) + count);
				
				if (c > 'z') 
				{	
					encrypted +=(char)(word.charAt(i) - (26 - count));
				} else
					{
					encrypted += c;
					}

				count--;
			}
			encrypted+=" ";
		}
		
		encrypted=encrypted.substring(0, encrypted.length()-1);
		System.out.println(encrypted);
	}

}
