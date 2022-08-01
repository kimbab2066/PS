package BOJ.DP;

import java.io.*;
import java.util.*;

public class P2565 {
	static int[][] arr;
	static Integer[] DP;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		arr = new int[N][2];
		DP = new Integer[N];

		StringTokenizer st;
		// value in arr
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.valueOf(st.nextToken());
			arr[i][1] = Integer.valueOf(st.nextToken());
		}

		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		int max = 0;

		for (int i = 0; i < N; i++) {
			max = Math.max(max, recur(i));
		}
		System.out.println(N - max);
	}// end of main

	static int recur(int N) {
		if (DP[N] == null) {
			DP[N] = 1;
			for (int i = N + 1; i < DP.length; i++) {
				if (arr[N][1] < arr[i][1]) {
					DP[N] = Math.max(DP[N], recur(i) + 1);
				}
			}
		}
		return DP[N];
	}// end of recur
}// end of class