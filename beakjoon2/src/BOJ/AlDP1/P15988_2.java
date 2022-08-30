package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P15988_2 {
	static final int MOD = 1_000_000_009;

	public static void main(String[] args) throws IOException {

		/*
		 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다.
		 * 
		 * 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 1_000_000_009로 나눈 나머지를 출력한다.
		 * 
		 * 점화식 DP[i] = DP[i-1] + DP[i-2] + DP[i-3];
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		long DP[] = new long[1_000_001];
		DP[1] = 1;
		DP[2] = 2;
		DP[3] = 4;
		while (T-- > 0) {
			int N = Integer.valueOf(br.readLine());
			for (int i = 4; i <= N; i++) {
				DP[i] = (DP[i - 1] + DP[i - 2] + DP[i - 3]) % MOD;
			}
			sb.append(DP[N] % MOD).append("\n");
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class