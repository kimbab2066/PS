package BOJ.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P11051 {
	static int DP[][];
	public static int div = 10007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.valueOf(str[0]);
		int K = Integer.valueOf(str[1]);
		DP = new int[N + 1][K + 1];

		int result = combi(N, K);
		System.out.println(result);
	}// end of main

	static int combi(int N, int K) {
		if (DP[N][K] > 0) return DP[N][K];
		if (N == K || K == 0) return 1;
		return DP[N][K] = (combi(N - 1, K - 1) + combi(N - 1, K)) % div;
	}// end of combi
}// end of class