package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P17404 {
	static final int INF = 1000_000;
	static int answer = INF;

	public static void main(String[] args) throws IOException {
		/*
		 * RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.
		 * 
		 * 1번 집의 색은 2번, N번 집의 색과 같지 않아야 한다.
		 * 
		 * N번 집의 색은 N-1번, 1번 집의 색과 같지 않아야 한다.
		 * 
		 * i(2 ≤ i ≤ N-1)번 집의 색은 i-1, i+1번 집의 색과 같지 않아야 한다.
		 * 
		 * 첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다.
		 *
		 * 첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.
		 * 
		 * 점화식 :DP[i][0,1,2] += Math.min(DP[i - 1][], DP[i - 1][]);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int val[][] = new int[N + 1][3];
		int DP[][] = new int[N + 1][3];

		for (int i = 1; i <= N; i++) {
			String str[] = br.readLine().split(" ");
			val[i][0] = Integer.valueOf(str[0]);// R
			val[i][1] = Integer.valueOf(str[1]);// G
			val[i][2] = Integer.valueOf(str[2]);// B
		}
		for (int k = 0; k < 3; k++) {
			for (int j = 0; j < 3; j++) {
				if (k == j) DP[1][j] = val[1][j];
				else DP[1][j] = INF;
			}
			for (int i = 2; i <= N; i++) {
				DP[i][0] = Math.min(DP[i - 1][1], DP[i - 1][2]) + val[i][0];// R
				DP[i][1] = Math.min(DP[i - 1][0], DP[i - 1][2]) + val[i][1];// G
				DP[i][2] = Math.min(DP[i - 1][0], DP[i - 1][1]) + val[i][2];// B
			}
			for (int i = 0; i < 3; i++) {
				if (i != k) answer = Math.min(DP[N][i], INF);
			}
		}

		System.out.println(answer);

	}// end of main
}// end of class