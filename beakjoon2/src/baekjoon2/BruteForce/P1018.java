package baekjoon2.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1018 {
	public static boolean[][] arr;
	public static int min = 64;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);

		arr = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		} // end of for

		int N_row = N - 7;
		int M_col = M - 7;

		for (int i = 0; i < N_row; i++) {
			for (int j = 0; j < M_col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}// end of main

	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int cnt = 0;

		boolean TF = arr[x][y];

		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {

				if (arr[i][j] != TF)
					cnt++;
				TF = !TF;
			}
			TF = !TF;
		}
		cnt = Math.min(cnt, 64 - cnt);
		min = Math.min(min, cnt);

	}
}// end of class
/*
 * 8<=N,M<=50 B = Black W = White 다시 칠해야할 정사각형의 개수의 최솟값
 */