package BOJ.DP;

import java.io.*;
import java.util.*;

public class P9184 {
	static int a, b, c;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int[][][] DP = new int[21][21][21];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			int c = Integer.valueOf(st.nextToken());
			// exception
			if (a == -1 && b == -1 && c == -1) break;
			sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a, b, c)).append("\n");
		} // end of while
		System.out.println(sb);

	}// end of main

	static int w(int a, int b, int c) {
		if (range(a, b, c) && DP[a][b][c] != 0) return DP[a][b][c];
		
		if (a <= 0 || b <= 0 || c <= 0) return 1;
		
		if (a > 20 || b > 20 || c > 20) return DP[20][20][20] = w(20, 20, 20);
		
		if (a < b && b < c) return DP[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
		
		return DP[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
		
	}// end of w

	static boolean range(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
	}
}// end of class