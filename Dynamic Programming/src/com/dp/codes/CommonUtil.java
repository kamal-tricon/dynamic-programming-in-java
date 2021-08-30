package com.dp.codes;

public class CommonUtil {
	public int getLCSubsequenceLength(String s1, String s2) {
		
		int len1 = s1.length();
		int len2 = s2.length();
		int dp[][] = new int [len1][len2];
		int longest = 0;
		
		// Below for loop can be used for longest common subsequence
		
		for (int i = 0; i < len1; i ++) {
			for (int j = 0; j < len2 ; j ++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					if (i == 0 || j == 0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = dp[i-1][j-1] + 1;
					}
				} else {
					if (i > 0 && j > 0) {
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					} else if (i > 0) {
						dp[i][j] = dp[i-1][j];
					} else if (j > 0) {
						dp[i][j] = dp[i][j - 1];
					}
				}
				if (longest < dp[i][j]) {
					longest = dp[i][j];
				}
			}
		}
		return longest;
	}
}
