package BOJ.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1904_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		System.out.println(recur(N));
	}

	static long recur(int N) {
		if (N <= 1)
			return 1;
		int DP[] = new int[N + 1];
		DP[0] = 1;
		DP[1] = 1;
		for (int i = 2; i <= N; i++) {
			DP[i] = (DP[i - 1] + DP[i - 2]) % 15746;
		}
		return DP[N];
	}
}
