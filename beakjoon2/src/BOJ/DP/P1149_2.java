package BOJ.DP;

import java.io.*;
import java.util.*;

public class P1149_2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int DP[][] = new int[N][3];
		StringTokenizer st;

		// value in array
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			DP[i][0] = Integer.valueOf(st.nextToken());// R
			DP[i][1] = Integer.valueOf(st.nextToken());// G
			DP[i][2] = Integer.valueOf(st.nextToken());// B
		}

		// MIN += 1 to N-1
		for (int i = 1; i < N; i++) {
			DP[i][0] += Math.min(DP[i - 1][1], DP[i - 1][2]);
			DP[i][1] += Math.min(DP[i - 1][0], DP[i - 1][2]);
			DP[i][2] += Math.min(DP[i - 1][0], DP[i - 1][1]);
		}

		System.out.println(Math.min(Math.min(DP[N - 1][0], DP[N - 1][1]), DP[N - 1][2]));
	}// end of main
}// end of class