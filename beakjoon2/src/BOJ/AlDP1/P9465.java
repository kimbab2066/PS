package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P9465 {
	public static void main(String[] args) throws IOException {
		/*
		 * 스티커의 점수의 최댓값을 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 
		 * 각 테스트 케이스의 첫째 줄에는 n (1 ≤ n ≤ 100,000)이 주어진다.
		 * 
		 * 다음 두 줄에는 n개의 정수가 주어지며, 각 정수는 그 위치에 해당하는 스티커의 점수이다.
		 * 
		 * 연속하는 두 정수 사이에는 빈 칸이 하나 있다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 * 
		 * 각 테스트 케이스 마다, 2n개의 스티커 중에서 두 변을 공유하지 않는 스티커 점수의 최댓값을 출력한다.
		 * 
		 * 점화식 : DP[i] = max(DP[i-1], DP[i-2]) + val[i];
		 * 
		 * DP[0][i] = Math.max(DP[1][i-1],DP[1][i-2]) + val[0][i];
		 * 
		 * DP[1][i] = Math.max(DP[0][i-1],DP[0][i-2]) + val[1][i];
		 */ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int val[][];
		int DP[][];

		while (T-- > 0) {
			int N = Integer.valueOf(br.readLine());
			val = new int[2][N + 1];
			DP = new int[2][N + 1];
			// value in val1
			for (int j = 0; j < 2; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 1; k <= N; k++) {
					val[j][k] = Integer.valueOf(st.nextToken());
				}
			}
			DP[0][1] = val[0][1];
			DP[1][1] = val[1][1];
			for (int i = 2; i <= N; i++) {
				DP[0][i] = Math.max(DP[1][i - 1], DP[1][i - 2]) + val[0][i];
				DP[1][i] = Math.max(DP[0][i - 1], DP[0][i - 2]) + val[1][i];
			}
			sb.append(Math.max(DP[0][N], DP[1][N])).append("\n");
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class