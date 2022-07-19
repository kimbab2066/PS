package BOJ.DP;

import java.io.*;
import java.util.*;

public class P1912 {
	static int N, MAX;
	static int[] arr;
	static int[] DP;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = new int[N];
		DP = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());

		// array in value
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}

		DP[0] = MAX = arr[0];

		for (int i = 1; i < N; i++) {
			DP[i] = Math.max(DP[i - 1] + arr[i], arr[i]);
			MAX = Math.max(MAX, DP[i]);
		}
		System.out.println(MAX);

	}// end of main

}// end of class