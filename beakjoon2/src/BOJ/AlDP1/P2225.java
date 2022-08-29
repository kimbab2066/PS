package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P2225 {
	static final int MOD = 1_000_000_000;

	public static void main(String[] args) throws IOException {
		/*
		 * 0부터 N까지의 정수 K개를 더해서 그 합이 N이 되는 경우의 수를 구하는 프로그램을 작성하시오.
		 * 
		 * 덧셈의 순서가 바뀐 경우는 다른 경우로 센다(1+2와 2+1은 서로 다른 경우). 또한 한 개의 수를 여러 번 쓸 수도 있다.
		 * 
		 * 첫째 줄에 두 정수 N(1 ≤ N ≤ 200), K(1 ≤ K ≤ 200)가 주어진다.
		 * 
		 * 첫째 줄에 답을 1_000_000_000으로 나눈 나머지를 출력한다.
		 * 
		 * 점화식 : DP[K][N] = DP[K][N-1] + DP[K-1][N]
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int N = Integer.valueOf(str[0]);
		int K = Integer.valueOf(str[1]);
		int DP[][] = new int[K + 1][N + 1];

		for (int i = 1; i <= K; i++) {
			DP[i][0] = 1;
			for (int j = 1; j <= N; j++) {
				DP[i][j] = (DP[i][j - 1] + DP[i - 1][j]) % MOD;
			}
		}
		System.out.println(DP[K][N]);
	}// end of main
}// end of class