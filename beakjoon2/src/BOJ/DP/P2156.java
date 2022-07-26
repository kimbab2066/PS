package BOJ.DP;

import java.io.*;

public class P2156 {
	static int N;
	static int arr[];
	static Integer DP[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = new int[N + 1];
		DP = new Integer[N + 1];

		// value in arr
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		DP[0] = arr[0] = 0;
		DP[1] = arr[1];
		if (N >= 2) {
			DP[2] = arr[1] + arr[2];
		}
		System.out.println(grape(N));

	}// end of main

	static int grape(int N) {
		if (DP[N] == null) {
			DP[N] = Math.max(Math.max(grape(N - 2), grape(N - 3) + arr[N - 1]) + arr[N], grape(N - 1));
		}
		return DP[N];
	}
}// end of class