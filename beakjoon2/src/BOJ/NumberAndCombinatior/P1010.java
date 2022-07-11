package BOJ.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P1010 {
	static int DP[][] = new int[30][30];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			sb.append(combi(M, N) + "\n");
		} // end of while
		System.out.println(sb);
	}// end of main

	static int combi(int a, int b) {
		if (DP[a][b] > 0) return DP[a][b];
		if (a == b || b == 0) return DP[a][b] = 1;
		return DP[a][b] = combi(a - 1, b - 1) + combi(a - 1, b);
	}// end of GCD
}// end of class