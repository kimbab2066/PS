package baekjoon2.Undefined;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2748 {
	static long[] fibo;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());

		fibo = new long[N + 1];
		for (int i = 0; i <= N; i++) {
			fibo[i] = -1;
		}

		fibo[0] = 0;
		fibo[1] = 1;

		System.out.println(fibo(N));
	}

	public static long fibo(int N) {
		if (fibo[N] == -1) {
			fibo[N] = fibo(N - 1) + fibo(N - 2);
		}
		return fibo[N];
	}// end of fibo
}
