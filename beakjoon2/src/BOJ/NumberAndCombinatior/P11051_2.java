package BOJ.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P11051_2 {
	public static int div = 10007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.valueOf(str[0]);
		int K = Integer.valueOf(str[1]);
		
		System.out.println((recur(N) * mod_inverse((recur(N - K) * recur(K)) % div, div - 2)) % div);
	}// end of main

	static int recur(int N) {
		if (N < 2) return 1;
		return N * recur(N - 1) % div;
	}// end of combi

	static int mod_inverse(int A, int P) {
		int ret = 1;
		while (P > 0) {
			if (P % 2 == 1) {
				ret *= A;
				P--;
				ret %= div;
			}
			A *= A;
			A %= div;
			P >>= 1;
		}
		return ret;
	}// end of mod
}// end of class