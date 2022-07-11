package BOJ.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2447_3 {
	static char[][] check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		check = new char[N][N];
		star(0, 0, N, false);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(check[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}// end of main

	static void star(int x, int y, int N, boolean blank) {
		// true = blank
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					check[i][j] = ' ';
				}
			}
			return;
		}
		if (N == 1) {
			check[x][y] = '*';
			return;
		}

		int size = N / 3;
		int cnt = 0;

		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				cnt++;
				if (cnt == 5) {// empty case
					star(i, j, size, true);// true = blank
				} else {
					star(i, j, size, false);
				}
			}
		}
	}// end of star
}// end of class

//3N단위로 끊어서 생각하면 편함
//N = 9일 때, 가운데 칸이 전부 공백인 이유임