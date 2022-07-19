package BOJ.DP;

import java.io.*;
import java.util.*;

public class P1912_2 {
	static int arr[];
	static int DP[];
	static int MAX, MAX2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		DP = new int[N];
		// array in value
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		DP[0] = MAX = MAX2 = arr[0];

		recur(N - 1);
		System.out.println(MAX);

		for (int i = 1; i < N; i++) {
			DP[i] = Math.max(DP[i - 1] + arr[i], arr[i]);
			MAX2 = Math.max(MAX2, DP[i]);
		}
		System.out.println(MAX2);
	}// end of main

	static int recur(int n) {
		if (DP[n] == 0) {
			DP[n] = Math.max(recur(n - 1) + arr[n], arr[n]);
			MAX = Math.max(DP[n], MAX);
		}
		return DP[n];
	}
}// end of class