package BOJ.DP;

import java.io.*;
import java.util.*;

public class P1904 {
	public static int[] DP = new int[1000001];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		DP[0] = 0;
		DP[1] = 1;
		DP[2] = 2;
		for (int i = 3; i <= N; i++) {
			DP[i] = -1;
		}
		System.out.println(recur(N));

	}// end of main

	static int recur(int n) {
		if (DP[n] == -1) {
			return DP[n] = (recur(n - 1) + recur(n - 2)) % 15746;
		}
		return DP[n];
	}// end of recur
}// end of class
