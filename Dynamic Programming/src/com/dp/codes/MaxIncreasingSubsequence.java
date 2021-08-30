package com.dp.codes;

import java.util.*;

public class MaxIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		for (int i = 0; i < len; i ++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		int max[] = new int [len];
		
		max[len - 1] = 1;
		int maxAns = 1;
		
		for (int i = len - 2; i >= 0; i --) {
			int maxFound = 0;
			for (int j = i + 1; j < len; j ++) {
				if (arr[j] > arr[i]) {
					maxFound = Math.max(maxFound, max[j]);
				}
			}
			max[i] = maxFound + 1;
			maxAns = Math.max(maxAns, max[i]);
		}
		
		System.out.println(maxAns);
		for (int i = 0; i < len; i ++) {
			System.out.print(max[i] + " ");
		}
	}

}
