package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P1149 {
	public static void main(String[] args) throws IOException {
		/*
		 * RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.
		 * 
		 * 1번 집의 색은 2번 집의 색과 같지 않아야 한다.
		 * 
		 * N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
		 * 
		 * i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
		 * 
		 * 첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다.
		 * 
		 * 둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다.
		 * 
		 * 집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.
		 * 
		 * 첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.
		 * 
		 * 점화식 DP[i][0,1,2] += Math.min(DP[i - 1][], DP[i - 1][]);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int DP[][] = new int[N][3];
		StringTokenizer st;

		// DPue in DP
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			DP[i][0] = Integer.valueOf(st.nextToken());// R
			DP[i][1] = Integer.valueOf(st.nextToken());// G
			DP[i][2] = Integer.valueOf(st.nextToken());// B
		}

		for (int i = 1; i < N; i++) {
			DP[i][0] += Math.min(DP[i - 1][1], DP[i - 1][2]);// R

			DP[i][1] += Math.min(DP[i - 1][0], DP[i - 1][2]);// G

			DP[i][2] += Math.min(DP[i - 1][0], DP[i - 1][1]);// B
		}
		System.out.println(Math.min(Math.min(DP[N - 1][0], DP[N - 1][1]), DP[N - 1][2]));

	}// end of main
}// end of class