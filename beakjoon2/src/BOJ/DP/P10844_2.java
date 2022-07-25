package BOJ.DP;

import java.io.*;

public class P10844_2 {
	static int N;
	static Long DP[][];
	static final int MOD = 1000000000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		DP = new Long[N + 1][10];
		// 첫번째 자릿수 1로 초기화
		for (int i = 0; i < 10; i++) {
			DP[1][i] = 1L;
		}
		long result = 0;
		// 마지막 자릿수1~9까지 경우의 수의 합
		for (int i = 1; i <= 9; i++) {
			result += stairs(N, i);
		}
		System.out.println(result % MOD);
	}// end of main
		// digit = 자릿수, val = 자리값

	static Long stairs(int digit, int val) {
		// 첫째 자리수에 도달한다면 탐색 끝
		if (digit == 1) {
			return DP[digit][val];
		}
		// 자릿수의 val(자리값) 탐색 전의 경우
		if (DP[digit][val] == null) {
			// 자리값이 0이면 다음 값은 무조건 1로 고정
			if (val == 0) {
				DP[digit][val] = stairs(digit - 1, 1);
			}
			// 자리값이 9면 다음 값은 무조건 8로 고정
			else if (val == 9) {
				DP[digit][val] = stairs(digit - 1, 8);
			}
			// 둘 다 호출해서 경우의 수를 합함
			else {
				DP[digit][val] = stairs(digit - 1, val - 1) + stairs(digit - 1, val + 1);
			}
		}
		return DP[digit][val] % MOD;
	}// end of stairs
}// end of class