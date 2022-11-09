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

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				matrix[i][j] = matrix[i][j - 1] + Integer.valueOf(st.nextToken());
			}
		}

		for (int i = 0; i < M; i++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.valueOf(st.nextToken());
			int y1 = Integer.valueOf(st.nextToken());
			int x2 = Integer.valueOf(st.nextToken());
			int y2 = Integer.valueOf(st.nextToken());
			for (int j = x1; j <= x2; j++) {
				sum += matrix[j][y2] - matrix[j][y1 - 1];
			}
			System.out.println(sum);
		}
	}// end of main
}// end of class