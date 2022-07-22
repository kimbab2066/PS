package BOJ.DP;

import java.io.*;
import java.util.*;

public class P2579 {
	static int N, val;
	static int arr[];
	static int DP[];
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		
		arr = new int[N + 1];
		DP = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		
		DP[1] = arr[1];
		
		if (N >= 2) {
			DP[2] = arr[1] + arr[2];
		}

		for (int i = 3; i <= N; i++) {
			DP[i] = Math.max(DP[i - 2], DP[i - 3] + arr[i - 1]) + arr[i];
		}

		System.out.println(DP[N]);
	}// end of main
}// end of class