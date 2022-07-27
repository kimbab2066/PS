package BOJ.DP;

import java.io.*;
import java.util.*;

public class P11053_2 {
	static int N;
	static int arr[];
	static Integer DP[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());

		arr = new int[N];
		DP = new Integer[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		// value in arr
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		// 0~N-1까지 탐색
		for (int i = 0; i < N; i++) {
			LIS(i);
		}

		int max = DP[0];
		// find max value
		for (int i = 1; i < N; i++) {
			max = Math.max(max, DP[i]);
		}
		System.out.println(max);
	}// end of main

	static int LIS(int N) {
		if (DP[N] == null) {
			DP[N] = 1;
			// Top-down recur N-1 to 0
			for (int i = N - 1; i >= 0; i--) {
				if (arr[i] < arr[N]) {
					DP[N] = Math.max(DP[N], LIS(i) + 1);
				}
			}
		}
		return DP[N];
	}// end of LIS
}// end of class
