package BOJ.DP;

import java.io.*;
import java.util.*;

public class P1932_2 {
	static int N;
	static int arr[][];
	static Integer DP[][];
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = new int[N][N];
		DP = new Integer[N][N];

		// value in arr
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = Integer.valueOf(st.nextToken());
			}
		}

		// N row value
		for (int i = 0; i < N; i++) {
			DP[N - 1][i] = arr[N - 1][i];
		}
		System.out.println(find(0, 0));

	}// end of main

	static int find(int depth, int idx) {
		// last row case
		if (depth == N - 1)
			return DP[depth][idx];
		// Integer Array's default value is null
		// no search case, next row compare left and right
		if (DP[depth][idx] == null)
			DP[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
		return DP[depth][idx];
	}// end of find
}// end of class