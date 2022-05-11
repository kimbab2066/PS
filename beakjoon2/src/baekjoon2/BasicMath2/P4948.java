package baekjoon2.BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4948 {
	static boolean[] prime = new boolean[246913];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		prime_number();

		while (true) {
			int cnt = 0;
			int N = Integer.parseInt(br.readLine());
			if (N == 0)
				break;
			for (int i = N + 1; i <= 2 * N; i++) {
				if (!prime[i])
					cnt++;
			}
			sb.append(cnt).append('\n');
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
	}
}// end of class

//	arr[] range = 246912+1
//	while(){}
//	if ( == 0) {end}
//	print(n+1<k<=2n)
//	prime_number