package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P2133 {
	public static void main(String[] args) throws IOException {
		/*
		 * 3×N 크기의 벽을 2×1, 1×2 크기의 타일로 채우는 경우의 수를 구해보자.
		 * 
		 * 첫째 줄에 N(1 ≤ N ≤ 30)이 주어진다.
		 * 
		 * 첫째 줄에 경우의 수를 출력한다.
		 * 
		 * 점화식 DP[i] = DP[i-2]*3 + DP[j] * 2;
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int DP[] = new int[N + 1];

		if (N % 2 == 0) {
			DP[0] = 1;
			DP[2] = 3;

			for (int i = 4; i <= N; i += 2) {
				DP[i] = DP[i - 2] * DP[2];
				for (int j = 0; j < i - 2; j += 2) {
					DP[i] += DP[j] * 2;
				}
			}
		}
		System.out.println(N % 2 == 0 ? DP[N] : 0);
	}// end of main
}// end of class