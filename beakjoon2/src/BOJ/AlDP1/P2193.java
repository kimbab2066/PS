package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P2193 {
	static long DP[];

	public static void main(String[] args) throws IOException {
		/*
		 * 이친수는 0으로 시작하지 않는다. 이친수에서는 1이 두 번 연속으로 나타나지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
		 * 
		 * N(1 ≤ N ≤ 90)이 주어졌을 때, N자리 이친수의 개수를 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 N이 주어진다.
		 * 
		 * 첫째 줄에 N자리 이친수의 개수를 출력한다.
		 * 
		 * 점화식 DP[N] = DP[N-1] + DP[N-2]
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		DP = new long[N + 1];
		// Top-Down
		System.out.println(pinaryNumber(N));
		// Bottom-Up
		long DP2[] = new long[N + 1];
		DP2[0] = 0;
		DP2[1] = 1;
		for (int i = 2; i <= N; i++) {
			DP2[i] = DP2[i - 1] + DP2[i - 2];
		}
		System.out.println(DP2[N]);
	}// end of main

	static long pinaryNumber(int N) {
		if (N == 1 || N == 2) return 1;
		else if (DP[N] != 0) return DP[N];
		return DP[N] = pinaryNumber(N - 1) + pinaryNumber(N - 2);
	}
}// end of class