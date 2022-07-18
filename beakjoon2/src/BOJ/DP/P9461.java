package BOJ.DP;

import java.io.*;
import java.util.*;

public class P9461 {
	static long DP[] = new long[101];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();

		while (T-- > 0) {
			int N = Integer.valueOf(br.readLine());// (1 ≤ N ≤ 100)
			sb.append(padovan(N)).append("\n");
		} // end of while
		System.out.println(sb);
	}// end of main

	static long padovan(int n) {

		DP[1] = DP[2] = DP[3] = 1;
		for (int i = 4; i <= n; i++) {
			DP[i] = DP[i - 2] + DP[i - 3];
		}
		return DP[n];
	}
}// end of class