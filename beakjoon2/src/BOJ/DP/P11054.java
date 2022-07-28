package BOJ.DP;

import java.io.*;
import java.util.*;

public class P11054 {
	static int arr[];
	static Integer DP[];
	static Integer DP2[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		DP = new Integer[N];
		DP2 = new Integer[N];
		// value in arr
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		// search 0~N-1
		for (int i = 0; i < N; i++) {
			LIS(i);
			LDS(i);
		}
		int max = -1;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, DP[i] + DP2[i]);
		}
		System.out.println(max - 1);
	}// end of main

	static int LIS(int N) {
		if (DP[N] == null) {
			DP[N] = 1;
			//0 to N-1 
			for (int i = N - 1; i >= 0; i--) {
				if (arr[i] < arr[N]) {
					DP[N] = Math.max(DP[N], LIS(i) + 1);
				}
			}
		}
		return DP[N];
	}// end of LIS

	// 그냥 LIS의 반대되는 개념
	static int LDS(int N) {
		if (DP2[N] == null) {
			DP2[N] = 1;
			//N+1 to arr.length
			for (int i = N + 1; i < DP2.length; i++) {
				if (arr[i] < arr[N]) {
					DP2[N] = Math.max(DP2[N], LDS(i) + 1);
				}
			}
		}
		return DP2[N];
	}
}// end of class