package baekjoon2.BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9020 {
	static boolean[] prime = new boolean[10001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		prime_number();
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			int p = N / 2;
			int q = N / 2;
			while (true) {
				if (!prime[p] && !prime[q]) {
					sb.append(p + " " + q).append("\n");
					break;
				}
				p--;
				q++;
			} // end of while
		} // end of while
		System.out.println(sb);
	}// end of main

	static void prime_number() {
		prime[0] = prime[1] = true;
		for (int i = 2; i < Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}// end of prime_number
}// end of class

//	first Test_case = T
//	n(even) = p_n + p_n (duple x)
//	prime_number();
//	output : small_number next_number 
