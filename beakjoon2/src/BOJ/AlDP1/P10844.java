package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P10844 {
	static Long DP[][];
	static final int MOD = 1_000_000_000;

	public static void main(String[] args) throws IOException {
		/*
		 * N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.
		 * 
		 * 첫째 줄에 N이 주어진다.N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.(DP[N+1][10])
		 * 
		 * 첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
		 * 
		 * 자릿수와 자릿값을 어떻게 사용하는지가 관건.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		DP = new Long[N + 1][10];// Rapper Class

		for (int i = 0; i < 10; i++) {
			DP[1][i] = 1L;
		}
		long result = 0;
		for (int i = 1; i <= 9; i++) {
			result += stair(N, i);
		}
		System.out.println(result % MOD);
		// Bottom-Up
		long DP2[][] = new long[N + 1][10];

		for (int i = 1; i < 10; i++) {
			DP2[1][i] = 1;
		}

		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					DP2[i][j] = DP2[i - 1][1] % MOD;
				} else if (j == 9) {
					DP2[i][j] = DP2[i - 1][8] % MOD;
				} else {
					DP2[i][j] = (DP2[i - 1][j - 1] + DP2[i - 1][j + 1]) % MOD;
				}
			}
		}

		long result2 = 0;
		for (int i = 0; i < 10; i++) {
			result2 += DP2[N][i];
		}
		System.out.println(result2 % MOD);

	}// end of main

	/*
	 * Top-Down
	 * 
	 * @param digit 자릿수, value 자릿값
	 */
	static long stair(int digit, int value) {
		// first digit case
		if (digit == 1) {
			return DP[digit][value];
		}
		// no search case
		if (DP[digit][value] == null) {
			if (value == 0) {
				DP[digit][value] = stair(digit - 1, 1);
			} else if (value == 9) {
				DP[digit][value] = stair(digit - 1, 8);
			} else {
				DP[digit][value] = stair(digit - 1, value - 1) + stair(digit - 1, value + 1);
			}
		}
		return DP[digit][value] % MOD;
	}// end of stair
}// end of class