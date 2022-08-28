package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P11053 {
	static int DP2[], val[];

	public static void main(String[] args) throws IOException {
		/*
		 * 수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
		 * 
		 * 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
		 * 
		 * 첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
		 * 
		 * val배열과 DP배열이 각각 필요해보임.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		val = new int[N];
		int DP[] = new int[N];
		DP2 = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		// value in val
		for (int i = 0; i < N; i++) {
			val[i] = Integer.valueOf(st.nextToken());
		}
		// Bottom-Up
		for (int i = 0; i < N; i++) {
			DP[i] = 1;
			for (int j = 0; j < i; j++) {
				if (val[j] < val[i] && DP[i] < DP[j] + 1) {
					DP[i] = DP[j] + 1;
				}
			}
		}
		// Top-Down
		for (int i = 0; i < N; i++) {
			LIS(i);
		}

		int max = -1;
		for (int i = 0; i < N; i++) {
			max = DP[i] > max ? DP[i] : max;
		}
		System.out.println(max);

		int max2 = -1;
		for (int i = 0; i < N; i++) {
			max2 = DP2[i] > max2 ? DP2[i] : max;
		}
		System.out.println(max2);

	}// end of main

	static int LIS(int N) {
		if (DP2[N] == 0) {
			DP2[N] = 1;
			for (int i = N - 1; i >= 0; i--) {
				if (val[i] < val[N]) {
					DP2[N] = DP2[N] > LIS(i) + 1 ? DP2[N] : LIS(i) + 1;
				}
			}
		}
		return DP2[N];
	}// end of LIS
}// end of class