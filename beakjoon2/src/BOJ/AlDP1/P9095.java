package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P9095 {
	public static void main(String[] args) throws IOException {
		/*
		 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
		 * 
		 * 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
		 * 
		 * 점화식 DP[N] = DP[N-1] + DP[N-2] + 1
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.valueOf(br.readLine());
		int DP[] = new int[11];
		DP[1] = 1;
		DP[2] = 2;
		DP[3] = 4;

		while (T-- > 0) {
			int N = Integer.valueOf(br.readLine());
			if (N > 3) {
				for (int i = 4; i <= N; i++) {
					DP[i] = DP[i - 1] + DP[i - 2] + DP[i - 3];
				}
			}
			sb.append(DP[N]).append("\n");
		}
		System.out.println(sb);
	}// end of main
}// end of class