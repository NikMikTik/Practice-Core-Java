package com.string;

public class String05 {

	public void func() {
		String phrase = "yum feed ";
		int count = 0;
		String s = "";
		int total=0;
		System.out.println(phrase);

		String b = "";
		for (int i = 0; i <phrase.length(); i++) {
			
			System.out.println(phrase.charAt(i));
			if ((phrase.charAt(i) == ' ')||(i==phrase.length()-1)) {
				int cc = count;
				total+=cc;
				System.out.println("_+_+_+_+" + cc);
				for (int j = total; j < cc; j++, count--) {
					System.out.println("------------" + phrase.charAt(j));
					char c = (char) (phrase.charAt(j) + count - 1);
					System.out.println("******" + c + " " + (count - 1));
					if (c > 'z') {
						s += (char) (phrase.charAt(j) - (26 - (count - 1)));
					} else {
						s += (char) (phrase.charAt(j) + count - 1);
					}

				}
				b += s;
				b += " ";
				s = "";
				count = 0;
			} else {
				System.out.println("#####"+phrase.charAt(i));
				count++;
				System.out.println("count:" + count);
				
			}
		}
		System.out.println(b);

	}

	public static void main(String[] args) {
		System.out.println("------");
		String05 str = new String05();
		str.func();
	}

}
