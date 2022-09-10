package BOJ.코테기초_수학;

import java.io.*;
import java.util.*;

public class P17425 {
	public static void main(String[] args) throws IOException {
		/*
		 * 두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다.
		 *
		 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 100,000)가 주어진다.
		 *
		 * 둘째 줄부터 테스트 케이스가 한 줄에 하나씩 주어지며 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
		 * 
		 * 각각의 테스트 케이스마다, 한 줄에 하나씩 g(N)를 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		long fx[] = new long[1_000_001];
		long DP[] = new long[1_000_001];
		// value in val
		for (int i = 1; i < fx.length; i++) {
			fx[i] = 1;
		} // end of for
		for (int i = 2; i < fx.length; i++) {
			for (int j = 1; j * i < fx.length; j++) {
				fx[i * j] += i;
			}
		}
		for (int i = 1; i < DP.length; i++) {
			DP[i] = DP[i - 1] + fx[i];
		}
		while (T-- > 0) {
			int N = Integer.valueOf(br.readLine());
			sb.append(DP[N]).append("\n");
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class