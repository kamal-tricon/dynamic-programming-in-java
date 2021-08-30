package com.recursion.codes;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverse("INDIAN"));

	}
	
	private static String reverse(String str) {
		
		if (str.length() <= 1) {
			return str;
		} else {
//			return "" + lastChar + reverse(str.substring(0, str.length() -1 ));
			return reverse(str.substring(1)) + str.charAt(0);
		}
	}

}
