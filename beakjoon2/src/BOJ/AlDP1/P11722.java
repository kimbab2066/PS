package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P11722 {
	public static void main(String[] args) throws IOException {
		/*
		 * 수열 A가 주어졌을 때, 가장 긴 감소하는 부분 수열을 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
		 * 
		 * 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
		 * 
		 * 첫째 줄에 수열 A의 가장 긴 감소하는 부분 수열의 길이를 출력한다.
		 * 
		 * 점화식 DP[i] = DP[j] + 1;
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.valueOf(br.readLine());
		int val[] = new int[N];
		int DP[] = new int[N];
		String str[] = br.readLine().split(" ");
		// value in val
		for (int i = 0; i < N; i++) {
			val[i] = Integer.valueOf(str[i]);
		}

		// Bottom-Up
		for (int i = 0; i < N; i++) {
			DP[i] = 1;
			for (int j = 0; j < i; j++) {
				if (val[j] > val[i] && DP[i] < DP[j] + 1) {
					DP[i] = DP[j] + 1;
				}
			}
		}
		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, DP[i]);
		}
		System.out.println(max);
	}// end of main
}// end of class