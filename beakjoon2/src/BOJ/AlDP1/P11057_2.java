package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P11057_2 {
	static final int MOD = 10_007;
	static long DP[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		DP = new long[N + 1][10];
		long DP2[][] = new long[N + 1][10];
		Arrays.fill(DP[1], 1);
		Arrays.fill(DP2[1], 1);
		// Top-Down
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += recur(N, i);
			sum %= MOD;
		}
		System.out.println(sum);
		// Bottom-Up
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k <= j; k++) {
					DP2[i][j] += DP2[i - 1][k];
					DP2[i][j] %= MOD;
				}
			}
		}
		int sum2 = 0;
		for (long val : DP2[N]) {
			sum2 += val;
		}
		System.out.println(sum2 % MOD);
	}// end of main

	static long recur(int digit, int value) {
		if (DP[digit][value] == 0) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j <= i; j++) {
					DP[digit][i] += recur(digit - 1, j);
					DP[digit][i] %= MOD;
				}
			}
		}
		return DP[digit][value] % MOD;
	}// end of recur
}// end of class