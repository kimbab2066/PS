package BOJ.AIMath1;

import java.io.*;
import java.util.*;

public class P6588 {
	public static boolean[] check = new boolean[1000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		makePrime();
		int N = 0;
		StringBuilder sb = new StringBuilder();
		while ((N = Integer.valueOf(br.readLine())) != 0) {
			boolean isPrime = true;
			for (int i = 2; i <= N; i++) {
				if (!check[i] && !check[N - i]) {
					sb.append(N).append(" = ").append(i).append(" + ").append(N - i).append("\n");
					isPrime = true;
					break;
				}
			}
			if (!isPrime) {
				System.out.println("Goldbach's conjecture is wrong.");
			}
			
		}
		System.out.println(sb);

	}// end of main

	static void makePrime() {
		check[0] = check[1] = true;
		for (int i = 2; i <= Math.sqrt(check.length); i++) {
			if (check[i])
				continue;
			for (int j = i * i; j < check.length; j += i) {
				check[j] = true;
			}
		}
	}// end of makePrime
}// end of class