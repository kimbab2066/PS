package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P15990 {
	static final int MOD = 1_000_000_009;

	public static void main(String[] args) throws IOException {
		/*
		 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다.
		 * 
		 * n은 양수이며 100,000보다 작거나 같다.
		 * 
		 * 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 1,000,000,009로 나눈 나머지를 출력한다.
		 * 
		 * 점화식
		 * 
		 * DP[N][1] = (DP[N-1][2] + DP[N-1][3]) % MOD;
		 * 
		 * DP[N][2] = (DP[N-2][1] + DP[N-2][3]) % MOD;
		 * 
		 * DP[N][3] = (DP[N-3][1] + DP[N-3][2]) % MOD;
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		long DP[][] = new long[100_001][4];
		DP[1][1] = 1;// 1
		DP[2][2] = 1;// 2
		DP[3][1] = 1;// 1+2
		DP[3][2] = 1;// 2+1
		DP[3][3] = 1;// 3

		// Bottom-Up
		for (int i = 4; i <= 100_000; i++) {
			DP[i][1] = (DP[i - 1][2] + DP[i - 1][3]) % MOD;
			DP[i][2] = (DP[i - 2][1] + DP[i - 2][3]) % MOD;
			DP[i][3] = (DP[i - 3][1] + DP[i - 3][2]) % MOD;
		}
		while (T-- > 0) {
			int N = Integer.valueOf(br.readLine());
			sb.append((DP[N][1] + DP[N][2] + DP[N][3]) % MOD).append("\n");
		}
		System.out.println(sb);
	}// end of main
}// end of class
