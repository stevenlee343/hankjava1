package com.tom;

public class Stringtester {

	public static void main(String[] args) {
		int n = 101;
		System.out.println(n != 99);
		String s1 = "Hello world";
		//			01234567890
		String s2 = new String("Hello world");
		System.out.println(s1 == s2);
		System.out.println(s1.substring(8));
		System.out.println(s1.substring(2,5));
		
		String r = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			r = r + s1.charAt(i);
			}
		System.out.println(r);

	}

}
