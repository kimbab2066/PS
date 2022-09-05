package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P13398_2 {
	static int N,val2[], left2[], right2[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		int[] val = new int[N];
		int[] left = new int[N];
		int[] right = new int[N];

		String str[] = br.readLine().split(" ");
		int max = Integer.MIN_VALUE;

		// left
		for (int i = 0; i < N; i++) {
			val[i] = Integer.valueOf(str[i]);
			if (i == 0) {
				left[i] = val[i];
			} else {
				left[i] = Math.max(left[i - 1] + val[i], val[i]);
			}
			max = Math.max(max, left[i]);
		}
		// right
		for (int i = N - 1; i >= 0; i--) {
			if (i == N - 1) {
				right[i] = val[i];
				continue;
			}
			right[i] = Math.max(right[i + 1] + val[i], val[i]);
		}

		for (int i = 1; i < N - 1; i++) {
			max = Math.max(max, left[i - 1] + right[i + 1]);
		}
		System.out.println(max);
		// Top-Down
		val2 = new int[N];
		left2 = new int[N];
		right2 = new int[N];
		for (int i = 0; i < N; i++) {
			val2[i] = Integer.valueOf(str[i]);
			left2[i] = Integer.MIN_VALUE;
			right2[i] = Integer.MIN_VALUE;
		}
		topDownLeft(N - 1);
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			result = Math.max(result, left2[i]);
		}

		topDownRight(0);
		for (int i = 1; i < N - 1; i++) {
			result = Math.max(result, left2[i - 1] + right2[i + 1]);
		}
		System.out.println(result);
	}// end of main

	static int topDownLeft(int N) {
		if (N == 0) return left2[N] = val2[N];
		if (left2[N] > Integer.MIN_VALUE) return left2[N];
		return left2[N] = Math.max(topDownLeft(N - 1) + val2[N], val2[N]);
	}// end of TDL

	static int topDownRight(int K) {
		if (K == N-1) return right2[K] = val2[K];
		if (right2[K] > Integer.MIN_VALUE) return right2[K];
		return right2[K] = Math.max(topDownRight(K + 1) + val2[K], val2[K]);
	}// end TDR
}// end of class