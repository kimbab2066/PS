package BOJ.AlDP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15989 {
	public static void main(String[] args) throws IOException {
		/*
		 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다.
		 * 
		 * n은 양수이며 10,000보다 작거나 같다.
		 * 
		 * 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
		 * 
		 * 점화식
		 * 
		 * DP[N][1] = DP[N-1][1];
		 * 
		 * DP[N][2] = DP[N-2][1] + DP[N-2][2];
		 * 
		 * DP[N][3] = DP[N-3][1] + DP[N-3][2]+ DP[N-3][3];
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();

		int DP[][] = new int[10001][4];

		DP[1][1] = 1;// 1
		DP[2][1] = 1;// 1+1
		DP[2][2] = 1;// 2
		DP[3][1] = 1;// 1+1+1
		DP[3][2] = 1;// 1+2
		DP[3][3] = 1;// 3

		while (T-- > 0) {
			int N = Integer.valueOf(br.readLine());
			for (int i = 4; i <= N; i++) {
				DP[i][1] = DP[i - 1][1];
				DP[i][2] = DP[i - 2][1] + DP[i - 2][2];
				DP[i][3] = DP[i - 3][1] + DP[i - 3][2] + DP[i - 3][3];
			}
			sb.append(DP[N][1] + DP[N][2] + DP[N][3]).append("\n");
		}
		System.out.println(sb);
	}// end of main
}// end of class