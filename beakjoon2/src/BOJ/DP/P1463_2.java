package BOJ.DP;

import java.io.*;
import java.util.*;

public class P1463_2 {
	static int N;
	static int arr[];
	static Integer DP[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = new int[N + 1];
		DP = new Integer[N + 1];
		DP[0] = DP[1] = 0;
		System.out.println(one(N));
	}// end of main

	static int one(int N) {
		if (DP[N] == null) {
			// -1의 경우, 3으로 나누는 경우, 2로 나누는 경우를 모두 호출 + 이전 재귀호출 중 최솟값에 1을 더한다.(현재 N에 대한최소연산횟수)
			if (N % 6 == 0) {
				DP[N] = Math.min(one(N - 1), Math.min(one(N / 3), one(N / 2)) + 1);
				// 3으로 나누는 경우, -1의 경우 + 이전 재귀호출 중 최솟값에 1을 더한다.(현재 N에 대한 최소연산 횟수)
			} else if (N % 3 == 0) {
				DP[N] = Math.min(one(N / 3), one(N - 1)) + 1;
				// 2로 나누는 경우, -1의 경우 + 이전 재귀호출 중 최솟값에 1을 더한다.(현재 N에 대한 최소연산 횟수)
			} else if (N % 2 == 0) {
				DP[N] = Math.min(one(N - 1), one(N / 2)) + 1;
				// -1의 경우 + 이전 재귀호출 중 최솟값에 1을 더한다.(현재 N에 대한 최소연산 횟수)
			} else {
				DP[N] = one(N - 1) + 1;
			}
		}
		return DP[N];
	}// end of one
}
// end of class