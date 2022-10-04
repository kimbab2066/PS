package BOJ.코테기초_브루트포스_비트마스크;

import java.io.*;
import java.util.*;

public class P14391_2 {
	static int N, M, result;
	static int[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// row, column을 확인해야 한다.
		String str[] = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		M = Integer.valueOf(str[1]);
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			map[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::valueOf).toArray();
		}
		result = total();
		System.out.println(result);
	}// end of main

	static int total() {
		int max = 0;
		for (int s = 0; s < (1 << (N * M)); s++) {
			int sum = 0;
			sum += getX(s);
			sum += getY(s);
			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}// end of dfs

	static int getX(int s) {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int tmp = 0;
			for (int j = 0; j < M; j++) {
				if ((s & (1 << i * M + j)) == 0) {// 0일때 가로
					tmp *= 10;
					tmp += map[i][j];
				} else {// 1이니 세로
					sum += tmp;
					tmp = 0;
				}
			}
			sum += tmp;
		}
		return sum;
	}// end of getX

	static int getY(int s) {
		int sum = 0;
		for (int j = 0; j < M; j++) {
			int tmp = 0;
			for (int i = 0; i < N; i++) {
				if ((s & (1 << i * N + j)) != 0) {// 1일때 세로
					tmp *= 10;
					tmp += map[i][j];
				} else {// 0일 때 가로
					sum += tmp;
					tmp = 0;
				}
			}
			sum += tmp;
		}
		return sum;
	}// end of getY
}// end of class