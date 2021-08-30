package com.dp.codes;

import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int cost[][] = new int[x][3];
		for (int i = 0; i < x; i ++) {
			for (int j= 0; j< 3; j ++) {
				cost[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
		
		int min[][] = new int[x][3];
		for (int j= 0; j< 3; j ++)
			min[0][j] = cost[0][j];
		
		for (int i = 1; i < x; i ++) {
			min[i][0] = Math.min(min[i-1][1], min[i-1][2]) + cost[i][0];
			min[i][1] = Math.min(min[i-1][0], min[i-1][2]) + cost[i][1];
			min[i][2] = Math.min(min[i-1][1], min[i-1][0]) + cost[i][2];
		}
		
		int minCost = Math.min(Math.min(min[x-1][0], min[x-1][1]), min[x-1][2]);
		System.out.println(minCost);
		
	}

}
