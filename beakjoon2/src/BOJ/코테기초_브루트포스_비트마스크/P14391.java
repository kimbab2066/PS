package BOJ.코테기초_브루트포스_비트마스크;

import java.io.*;
import java.util.*;

public class P14391 {
	static int N, M;
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 가로 N, 세로 M이 주어지고 점수의 최대값을 구하여라
		String str[] = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		M = Integer.valueOf(str[1]);
		arr = new int[N][M];

		for (int i = 0; i < N; i++) {
			arr[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::valueOf).toArray();
		}
		// row = 0, column = 1
		int result = total();
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
	}// end of total

	static int getX(int s) {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int tmp = 0;
			for (int j = 0; j < M; j++) {
				if ((s & (1 << i * M + j)) == 0) {
					tmp *= 10;
					tmp += arr[i][j];
				} else {
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
				if ((s & (1 << i * M + j)) != 0) {
					tmp *= 10;
					tmp += arr[i][j];
				} else {
					sum += tmp;
					tmp = 0;
				}
			}
			sum += tmp;
		}
		return sum;
	}
}// end of class