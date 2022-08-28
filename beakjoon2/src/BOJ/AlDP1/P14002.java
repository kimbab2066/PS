package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P14002 {
	static int DP[], DP2[], val[];

	public static void main(String[] args) throws IOException {
		/*
		 * 수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
		 * 
		 * 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
		 * 
		 * 첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
		 * 
		 * 둘째 줄에는 가장 긴 증가하는 부분 수열을 출력한다. 그러한 수열이 여러가지인 경우 아무거나 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		DP = new int[N];
		DP2 = new int[N];
		val = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		// value in val
		for (int i = 0; i < N; i++) {
			val[i] = Integer.valueOf(st.nextToken());
		}

		// Bottom-Up
		for (int i = 0; i < N; i++) {
			DP[i] = 1;
			for (int j = 0; j < i; j++) {
				if (val[j] < val[i] && DP[i] < DP[j] + 1) {
					DP[i] = DP[j] + 1;
				}
			}
		}
		// Top-Down
		for (int i = 0; i < N; i++) {
			LIS(i);
		}

		int max = -1;
		for (int i = 0; i < N; i++) {
			max = max > DP[i] ? max : DP[i];
		}
		sb.append(max + "\n");

		Stack<Integer> stack = new Stack<>();
		for (int i = N - 1; i >= 0; i--) {
			if (DP[i] == max) {
				stack.push(val[i]);
				max--;
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop() + " ");
		}
		System.out.println(sb);
		//
		int max2 = -1;
		for (int i = 0; i < N; i++) {
			max2 = max2 > DP2[i] ? max2 : DP2[i];
		}
		sb2.append(max2 + "\n");
		Stack<Integer> stack2 = new Stack<>();
		for (int i = N - 1; i >= 0; i--) {
			if (DP[i] == max2) {
				stack2.push(val[i]);
				max2--;
			}
		}
		while (!stack2.isEmpty()) {
			sb2.append(stack2.pop() + " ");
		}
		System.out.println(sb2);

	}// end of main

	static int LIS(int N) {
		if (DP2[N] == 0) {
			DP2[N] = 1;
			for (int i = N - 1; i >= 0; i--) {
				if (val[i] < val[N]) {
					DP2[N] = DP2[N] > LIS(i) + 1 ? DP2[N] : LIS(i) + 1;
				}
			}
		}
		return DP2[N];
	}// end of LIS
}// end of class