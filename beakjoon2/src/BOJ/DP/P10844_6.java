package BOJ.DP;

import java.io.*;

public class P10844_6 {
	static int N;
	static long DP[][];
	static final int MOD = 1000000000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		DP = new long[N + 1][10];

		// 0은 올 수 없기에 제외하고 1자리일 때 1개를 의미
		for (int i = 1; i < 10; i++) {
			DP[1][i] = 1;
		}

		// 2~N까지의 자릿 수 탐색
		for (int i = 2; i <= N; i++) {
			// 들어올 수 있는 값은 0~9
			for (int j = 0; j <= 9; j++) {
				if (j == 0) {
					DP[i][0] = DP[i - 1][1] % MOD;// 범위값이 크기 때문에 모듈러 연산을 사용
				} else if (j == 9) {
					DP[i][9] = DP[i - 1][8] % MOD;
				} else {
					DP[i][j] = (DP[i - 1][j - 1] + DP[i - 1][j + 1]) % MOD;
				}
			}
		}
		long result = 0;
		for (int i = 0; i <= 9; i++) {
			result += DP[N][i] % MOD;
		}
		System.out.println(result);
	}// end of main
}// end of class
/*
 * 중요 포인트 DP[1] = 첫째 자릿 수
 */