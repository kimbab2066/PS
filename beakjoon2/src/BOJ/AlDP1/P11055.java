package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P11055 {
	public static void main(String[] args) throws IOException {
		/*
		 * 수열 A가 주어졌을 때, 그 수열의 증가 부분 수열 중에서 합이 가장 큰 것을 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
		 * 
		 * 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
		 * 
		 * 첫째 줄에 수열 A의 합이 가장 큰 증가 부분 수열의 합을 출력한다.
		 * 
		 * 점화식 : DP[i] = Math.max(DP[i],DP[j]+val[i])
		 * 
		 * 이전 값보다 크면 + val[i]
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, j, N = Integer.valueOf(br.readLine()), max = 0, val[] = new int[N + 1], DP[] = new int[N + 1];
		String str[] = br.readLine().split(" ");

		// value in val
		for (i = 1; i <= N; i++) {
			val[i] = Integer.valueOf(str[i - 1]);
		}

		for (i = 1; i <= N; i++) {
			DP[i] = val[i];
			for (j = 1; j < i; j++) {
				if (val[i] > val[j]) {
					DP[i] = Math.max(DP[i], DP[j] + val[i]);
				}
			}
		}
		max = 0;
		for (i = 1; i <= N; i++) {
			max = DP[i] > max ? DP[i] : max;
		}
		System.out.println(max);
	}// end of main
}// end of class