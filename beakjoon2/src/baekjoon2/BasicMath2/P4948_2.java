package baekjoon2.BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4948_2 {
	static boolean[] prime = new boolean[246913];
	static int[] prime_cnt = new int[246913];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		prime_number();
		prime_count();

		while (true) {
			int N = Integer.parseInt(br.readLine());
			if (N == 0)
				break;

			sb.append(prime_cnt[2 * N] - prime_cnt[N]).append('\n');
		}
		System.out.println(sb);
	}// end of main

	static void prime_number() {
		prime[0] = prime[1] = true;
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}// end of prime_number

	static void prime_count() {
		int cnt = 0;
		for (int i = 2; i < prime.length; i++) {
			if (!prime[i])
				cnt++;

			prime_cnt[i] = cnt;
		}
	}

}// end of class

//	arr[] range = 246912+1
//	while(){}
//	if ( == 0) {end}
//	print(n+1<k<=2n)
//	prime_number