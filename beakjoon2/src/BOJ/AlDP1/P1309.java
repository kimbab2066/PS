package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P1309 {
	static final int MOD = 9901;

	public static void main(String[] args) throws IOException {
		/*
		 * 어떤 동물원에 가로로 두칸 세로로 N칸인 아래와 같은 우리가 있다.
		 * 
		 * 가로로도 세로로도 붙어 있게 배치할 수는 없다.
		 * 
		 * 2*N 배열에 사자를 배치하는 경우의 수가 몇 가지인지를 알아내는 프로그램을 작성해 주도록 하자.
		 * 
		 * 사자를 한 마리도 배치하지 않는 경우도 하나의 경우의 수로 친다고 가정한다.
		 * 
		 * 첫째 줄에 우리의 크기 N(1≤N≤100,000)이 주어진다.
		 * 
		 * 첫째 줄에 사자를 배치하는 경우의 수를 9901로 나눈 나머지를 출력하여라.
		 * 
		 * 점화식 DP[N][0,1,2] = (DP[i - 1][] + DP[i - 1][]) % MOD;
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.valueOf(br.readLine());

		// 0 = X, 1 = left, 2 = right
		int DP[][] = new int[N + 1][3];

		DP[1][0] = DP[1][1] = DP[1][2] = 1;

		for (int i = 2; i <= N; i++) {
			DP[i][0] = (DP[i - 1][0] + DP[i - 1][1] + DP[i - 1][2]) % MOD;
			DP[i][1] = (DP[i - 1][0] + DP[i - 1][2]) % MOD;
			DP[i][2] = (DP[i - 1][0] + DP[i - 1][1]) % MOD;
		}
		System.out.println((DP[N][0] + DP[N][1] + DP[N][2]) % MOD);
	}// end of main
}// end of class