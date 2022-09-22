package BOJ.코테기초_브루트포스_재귀;

import java.io.*;
import java.util.*;

public class P14501_2 {
	static int N;
	static int[] T, P, DP;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 각각의 상담은 상담을 완료하는데 걸리는 기간 Ti와 상담을 했을 때 받을 수 있는 금액 Pi로 이루어져 있다.
		 * 
		 * 상담을 적절히 했을 때, 백준이가 얻을 수 있는 최대 수익을 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 N (1 ≤ N ≤ 15)이 주어진다.
		 * 
		 * 둘째 줄부터 N개의 줄에 Ti와 Pi가 공백으로 구분되어서 주어지며, 1일부터 N일까지 순서대로 주어진다.
		 * 
		 * (1 ≤ Ti ≤ 5, 1 ≤ Pi ≤ 1,000)
		 * 
		 * 첫째 줄에 백준이가 얻을 수 있는 최대 이익을 출력한다.
		 * 
		 * 점화식 구하기. DP[i+T[i]] = max(DP[i+T[i]],DP[i]+P[i]);
		 */
		N = Integer.valueOf(br.readLine());
		T = new int[N + 1];
		P = new int[N + 1];
		DP = new int[N + 1];
		StringTokenizer st;
		// value in T[i],P[i]
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			T[i] = Integer.valueOf(st.nextToken());
			P[i] = Integer.valueOf(st.nextToken());
		}
		for (int i = 0; i < N; i++) {
			if (i + T[i] <= N) {
				DP[i + T[i]] = Math.max(DP[i + T[i]], DP[i] + P[i]);
			}
			DP[i + 1] = Math.max(DP[i + 1], DP[i]);
		}
		System.out.println(DP[N]);
	}// end of main
}// end of class