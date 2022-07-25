package BOJ.DP;

import java.io.*;
import java.util.*;

public class P10844 {
	static int N;
	static Long DP[][];
	static final long MOD = 1000000000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		DP = new Long[N + 1][10];

		for (int i = 0; i < 10; i++) {
			DP[1][i] = 1L;
		}
		long result = 0;
		for (int i = 1; i <= 9; i++) {
			result += recur(N, i);
		}
		System.out.println(result % MOD);
	}// end of main

	// 자릿수와 자리값
	static long recur(int digit, int val) {
		if (digit == 1) {
			return DP[digit][val];
		}
		if (DP[digit][val] == null) {
			// val = 0인 경우 다음 수는 1로 고정
			if (val == 0) {
				DP[digit][val] = recur(digit - 1, 1);
			}
			// val = 9인 경우 다음 수는 8로 고정
			else if (val == 9) {
				DP[digit][val] = recur(digit - 1, 8);
			}
			// 그 외
			else {
				DP[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
			}
		}
		return DP[digit][val] % MOD;
	}// end of recur
}// end of class