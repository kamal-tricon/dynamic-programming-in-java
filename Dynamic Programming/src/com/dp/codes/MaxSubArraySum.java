package com.dp.codes;

import java.util.*;

public class MaxSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		for (int i = 0; i< len; i ++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		int max = arr[0];
		
		int temp[][] = new int[2][len];
		temp[0][0] = arr[0];
		for (int i = 1; i< len; i ++) {
			temp[0][i] = temp[0][i-1] + arr[i];
			if (temp[0][i] > max) {
				max = temp[0][i];
			}
		}
		
		
		for (int i = 1; i < len; i ++) {
			for (int j = i; j < len ; j ++) {
				temp[1][j] = temp[0][j] - arr[i - 1];
				if (temp[1][j] > max) {
					max = temp[1][j];
				}
				temp[0][j] = temp[1][j];
			}
		}
		
		System.out.println(max);
	}

}
