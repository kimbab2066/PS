package BOJ.DP;

import java.io.*;
import java.util.*;

public class P1932_3 {
	static int N;
	static int arr[][];
	static Integer DP[][]; // Why use ? default null
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

		// Depth = N - 1
		for (int i = 0; i < N; i++) {
			DP[N - 1][i] = arr[N - 1][i];
		}

		System.out.println(tFind(0, 0));

	}// end of main

	static int tFind(int depth, int index) {
		// last row
		if (depth == N - 1)
			return DP[depth][index];
		// max value update
		if (DP[depth][index] == null)
			DP[depth][index] = Math.max(tFind(depth + 1, index), tFind(depth + 1, index + 1)) + arr[depth][index];

		return DP[depth][index];
	}// end of tFind
}// end of class