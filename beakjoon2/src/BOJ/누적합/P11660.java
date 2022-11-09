package BOJ.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11660 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// NxN의 matrix가 주어지고 M개의 줄에 x1,y1 x2,y2가 주어지면 그 범위를 구하라는 문제
		// 그러면 [x2][y2] - [x2][y1-1]... [x1][y2] - [x1][y1-1]
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());

		int[][] matrix = new int[N + 1][N + 1];
		int[][] dp = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				matrix[i][j] = Integer.valueOf(st.nextToken());
			}
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + matrix[i][j];
			}
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.valueOf(st.nextToken());
			int y1 = Integer.valueOf(st.nextToken());
			int x2 = Integer.valueOf(st.nextToken());
			int y2 = Integer.valueOf(st.nextToken());
			int result = dp[x2][y2] - dp[x2][y1 - 1] - dp[x1 - 1][y2] + dp[x1 - 1][y1 - 1];
			System.out.println(result);
		}
	}// end of main
}// end of class