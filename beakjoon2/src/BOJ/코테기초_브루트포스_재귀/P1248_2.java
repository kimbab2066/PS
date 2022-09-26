package BOJ.코테기초_브루트포스_재귀;

import java.io.*;
import java.util.*;

public class P1248_2 {
	static int N;
	static char[][] matrix;
	static int[] result;
	static String str;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		matrix = new char[N][N];
		result = new int[N];
		str = br.readLine();

		int idx = 0;
		// value in matrix
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				matrix[i][j] = str.charAt(idx++);
			}
		}
		dfs(0);

	}// end of main

	static void dfs(int depth) {
		if (depth == N) {
			for (int i : result) {
				sb.append(i + " ");
			}
			System.out.println(sb);
			System.exit(0);
		}
		for (int i = -10; i <= 10; i++) {
			result[depth] = i;
			if (check(depth))
				dfs(depth + 1);
		}
	}// end of dfs

	static boolean check(int idx) {
		for (int i = 0; i <= idx; i++) {
			int sum = 0;
			for (int j = i; j <= idx; j++) {
				sum += result[j];
				if (matrix[i][j] != (sum == 0 ? '0' : (sum > 0 ? '+' : '-'))) {
					return false;
				}
			}
		}
		return true;
	}// end of check
}// end of class