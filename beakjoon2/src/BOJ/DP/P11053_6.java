package BOJ.DP;

import java.io.*;
import java.util.*;

public class P11053_6 {
	static int arr[], DP[];

	public static void main(String[] args) throws IOException {
		/*
		 * 수열 A의 크기 X / StringTokenizer / arr[], DP[]
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());

		arr = new int[N];
		DP = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		// value in arr
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			DP[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && DP[i] < DP[j] + 1) {
					DP[i] = DP[j] + 1;
				}
			}
		}
		int max = -1;
		for (int i = 0; i < N; i++) {
			max = max > DP[i] ? max : DP[i];
		}
		System.out.println(max);
	}// end of main
}// end of class