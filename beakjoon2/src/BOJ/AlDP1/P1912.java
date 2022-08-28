package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P1912 {
	static int val[];
	static Integer DP2[];
	static int result2;

	public static void main(String[] args) throws IOException {
		/*
		 * n개의 정수로 이루어진 임의의 수열이 주어진다.
		 * 
		 * 우리는 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다. 단, 수는 한 개 이상 선택해야 한다.
		 * 
		 * 첫째 줄에 정수 n(1 ≤ n ≤ 100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다.
		 * 
		 * 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.
		 * 
		 * 첫째 줄에 답을 출력한다.
		 * 
		 * 점화식이 있을까?
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		val = new int[N];
		int DP[] = new int[N];
		DP2 = new Integer[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		// value in val
		for (int i = 0; i < N; i++) {
			val[i] = Integer.valueOf(st.nextToken());
		}
		// Bottom-Up
		int result = result2 = DP[0] = DP2[0] = val[0];
		for (int i = 1; i < N; i++) {
			DP[i] = Math.max(DP[i - 1] + val[i], val[i]);
			result = result > DP[i] ? result : DP[i];
		}
		System.out.println(result);

		// Top-Down
		recur(N - 1);

		System.out.println(result2);
	}// end of main

	static int recur(int N) {
		if (DP2[N] == null) {
			DP2[N] = Math.max(recur(N - 1) + val[N], val[N]);
			result2 = result2 > DP2[N] ? result2 : DP2[N];
		}
		return DP2[N];
	}// end of recur
}// end of class