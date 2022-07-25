package BOJ.DP;

import java.io.*;

public class P10844_3 {
	static int N;
	static long DP[][];
	static final int MOD = 1000000000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		DP = new long[N + 1][10];
		// 첫번째 자릿수 1로 초기화
		for (int i = 1; i < 10; i++) {
			DP[1][i] = 1;
		}
		// 둘째자릿수부터 N까지 탐색
		for (int i = 2; i <= N; i++) {
			// i번째 자릿수의 자릿값들 j = 0 to 9
			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					DP[i][0] = DP[i - 1][1] % MOD;
				} else if (j == 9) {
					DP[i][9] = DP[i - 1][8] % MOD;
				} else {
					DP[i][j] = (DP[i - 1][j - 1] + DP[i - 1][j + 1]) % MOD;
				}
			}
		}
		long result = 0;

		for (int i = 0; i < 10; i++) {
			result += DP[N][i];
		}
		System.out.println(result % MOD);
	}// end of main
}// end of class