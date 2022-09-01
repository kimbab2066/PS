package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P11057 {
	static final int MOD = 10_007;
	static long DP2[][];

	public static void main(String[] args) throws IOException {
		/*
		 * 오르막 수는 수의 자리가 오름차순을 이루는 수를 말한다. 이때, 인접한 수가 같아도 오름차순으로 친다.
		 * 
		 * 수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램을 작성하시오. 수는 0으로 시작할 수 있다.
		 * 
		 * 첫째 줄에 N (1 ≤ N ≤ 1,000)이 주어진다.
		 * 
		 * 첫째 줄에 길이가 N인 오르막 수의 개수를 10_007로 나눈 나머지를 출력한다.
		 * 
		 * 점화식 DP[N] = DP[i]<=DP[j] % MOD;
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int DP[][] = new int[N + 1][10];
		DP2 = new long[N + 1][10];

		Arrays.fill(DP[1], 1);
		Arrays.fill(DP2[1], 1);

		// Bottom-Up
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k <= j; k++) {
					DP[i][j] += DP[i - 1][k];
					DP[i][j] %= MOD;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += DP[N][i];
		}
		System.out.println(sum % MOD);
		// Top-Down
		long sum2 = 0;
		for (int i = 0; i < 10; i++) {
			sum2 += recur(N, i);
			sum2 %= MOD;
		}
		System.out.println(sum2);
	}// end of main

	public static long recur(int N, int num) {
		if (DP2[N][num] == 0) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j <= i; j++) {
					DP2[N][i] += recur(N - 1, j);
					DP2[N][i] %= MOD;
				}
			}
		}
		return DP2[N][num] % MOD;
	}// end of recur
}// end of class