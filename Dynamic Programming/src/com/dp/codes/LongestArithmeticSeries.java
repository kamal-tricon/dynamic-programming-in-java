package com.dp.codes;

import java.util.Scanner;

public class LongestArithmeticSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		for (int i = 0; i < len; i ++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		int maxLen = 1;
		for (int i = 0; i < len - 1; i ++) {
			int cd = arr[i + 1] - arr[i];
			int start = i + 1;
			int end = i + 2;
			int count = 1;
			while (end < len) {
				if (arr[end] - arr[start] == cd) {
					count ++;
				}
				end ++;
			}
		}
	}

}
