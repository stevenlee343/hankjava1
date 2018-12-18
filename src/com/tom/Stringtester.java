package com.tom;

public class Stringtester {

	public static void main(String[] args) {
		int n = 101;
		System.out.println(n != 99);
		String s1 = "Hello world";
		//			01234567890
		String s2 = new String("Jack Tom Eric");
		//						0123456789012 
		System.out.println(s1 == s2);
		System.out.println(s1.substring(8));
		System.out.println(s1.substring(2,5));
		
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
			}
		System.out.println();
		String name = "Tom";
		int index = s2.indexOf(name);
		System.out.println(index);
		System.out.println(s2.substring(0, index) + "boss"
		+ s2.substring(index + name.length()));

	}

}
