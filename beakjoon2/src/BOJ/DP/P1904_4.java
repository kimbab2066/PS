package BOJ.DP;

import java.io.*;

public class P1904_4 {
	static int DP[] = new int[1000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		DP[0] = DP[1] = 1;
		DP[2] = 2;
		for (int i = 3; i <= N; i++) {
			DP[i] = -1;
		}
		System.out.println(tile01(N));
	}// end of main

	static int tile01(int N) {

		if (N <= 1)
			return 1;
		// 사실상 index[0]은 안쓰는 공간이기에 +1

		if (DP[N] == -1) {
			for (int i = 3; i <= N; i++) {
				DP[i] = (DP[i - 1] + DP[i - 2]) % 15746;
			}
		}
		return DP[N];
	}// end of tile
}// end of class