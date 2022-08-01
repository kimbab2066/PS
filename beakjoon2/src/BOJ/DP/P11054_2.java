package BOJ.DP;

import java.io.*;
import java.util.*;

public class P11054_2 {
	static int N;
	static int arr[];
	static Integer DP[];
	static Integer DP2[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());

		arr = new int[N];
		DP = new Integer[N];
		DP2 = new Integer[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		// value in arr
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		// call LIS,LDS
		for (int i = 0; i < N; i++) {
			LIS(i);
			LDS(i);
		}

		int max = -1;
		// find max value
		for (int i = 0; i < N; i++) {
			max = max > DP[i] + DP2[i] ? max : DP[i] + DP2[i];
		}
		System.out.println(max - 1);// 정점이 1개 겹쳐서 -1
	}// end of main

	static int LIS(int N) {
		// no search case
		if (DP[N] == null) {
			DP[N] = 1;// init value = 1
			// 0 to N-1
			for (int i = 0; i < N; i++) {
				if (arr[i] < arr[N]) {
					DP[N] = Math.max(DP[N], LIS(i) + 1);
				}
			}
		}
		return DP[N];
	}// end of LIS

	static int LDS(int N) {
		// no search case
		if (DP2[N] == null) {
			DP2[N] = 1;// init value = 1
			// N+1 to last index
			for (int i = N + 1; i < DP2.length; i++) {
				if (arr[i] < arr[N]) {
					DP2[N] = Math.max(DP2[N], LDS(i) + 1);
				}
			}
		}
		return DP2[N];
	}// end of LDS
}// end of class