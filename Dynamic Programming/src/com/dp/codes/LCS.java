package com.dp.codes;

import java.util.Scanner;

public class LCS {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		sc.close();
		
		CommonUtil cu = new CommonUtil();
		int longest = cu.getLCSubsequenceLength(s1, s2);
		
		System.out.println(longest);
	}
}
