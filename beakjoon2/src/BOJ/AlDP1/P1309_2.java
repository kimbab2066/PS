package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P1309_2 {
	static final int MOD = 9901;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int DP[][] = new int[N + 1][3];

		Arrays.fill(DP[1], 1);

		for (int i = 2; i <= N; i++) {
			DP[i][0] = (DP[i - 1][0] + DP[i - 1][1] + DP[i - 1][2]) % MOD;
			DP[i][1] = (DP[i - 1][0] + DP[i - 1][2]) % MOD;
			DP[i][2] = (DP[i - 1][0] + DP[i - 1][1]) % MOD;
		}
		System.out.println((DP[N][0] + DP[N][1] + DP[N][2]) % MOD);
	}// end of main
}// end of class