package BOJ.코테기초_브루트포스_재귀;

import java.io.*;
import java.util.*;

public class P1248 {
	static int N;
	static char[][] matrix;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		matrix = new char[N][N];
		arr = new int[N];

		String str = br.readLine();
		int idx = 0;
		// value in matrix
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				matrix[i][j] = str.charAt(idx++);
			}
		}
		solve(0);
	}// end of main

	static void solve(int depth) {
		if (depth == N) {
			for (int i : arr) {
				sb.append(i + " ");
			}
			System.out.println(sb);
			System.exit(0);
		}
		for (int i = -10; i <= 10; i++) {
			arr[depth] = i;
			if (check(depth)) {
				solve(depth + 1);
			}
		}
	}// end of solve

	static boolean check(int idx) {
		for (int i = 0; i <= idx; i++) {
			int sum = 0;
			for (int j = i; j <= idx; j++) {
				sum += arr[j];
				// sum == 0 ? 0 and sum > 0 ? + : -
				if (matrix[i][j] != (sum == 0 ? '0' : (sum > 0 ? '+' : '-'))) {
					return false;
				}
			}
		}
		return true;
	}// end of check
}// end of class