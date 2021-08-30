package com.dp.codes;

import java.util.Scanner;

public class MinJumpArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		for (int i = 0; i < len; i ++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		int min[] = new int [len];
		min[0] = 0;
		for (int i = 1; i < len; i ++) {
			min[i] = Integer.MAX_VALUE;
		}
		
		for (int i = 1; i < len; i ++) {
			for (int j  = 0; j < i; j ++) {
				if (arr[j] >= i - j) {
					min[i] = Math.min(min[j] + 1, min[i]);
				}
			}
		}
		
		if (min[len-1] == Integer.MAX_VALUE) {min[len-1] = -1;}
		
		for (int i = 0; i < len; i ++) {
			System.out.print(min[i] + " ");
		}
	}


}
