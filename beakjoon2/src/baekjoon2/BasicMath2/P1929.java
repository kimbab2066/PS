package baekjoon2.BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1929 {
	public static boolean[] prime;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		prime = new boolean[N + 1];
		prime_number();

		for (int i = M; i <= N; i++) {
			if (!prime[i]) sb.append(i).append("\n");
		}
		System.out.println(sb);
	}//end of main
	static void prime_number() {
		prime[0] = prime[1] = true;
		for (int i = 2; i < Math.sqrt(prime.length); i++) {
			if (prime[i]) continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}// end of prime_number
}//end of class
