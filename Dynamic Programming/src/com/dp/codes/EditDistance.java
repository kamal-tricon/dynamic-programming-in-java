package com.dp.codes;

import java.util.Scanner;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		sc.close();
		
		CommonUtil cu = new CommonUtil();
		int longest = cu.getLCSubsequenceLength(s1, s2);
		int maxLength = Math.max(s1.length(), s2.length());
		
		System.out.println(maxLength - longest);
	}

}
