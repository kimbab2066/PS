package BOJ.AIMath1;

import java.io.*;
import java.util.*;

public class P2004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		long N = Long.valueOf(str[0]);
		long M = Long.valueOf(str[1]);

		long five = five(N) - five(M) - five(N - M);
		long two = two(N) - two(M) - two(N - M);
		System.out.println(Math.max(five, two));

	}// end of main

	static long five(long n) {
		int cnt = 0;
		while (n >= 5) {
			cnt += (n / 5);
			n /= 5;
		}
		return cnt;
	}

	static long two(long n) {
		int cnt = 0;
		while (n >= 2) {
			cnt += (n / 2);
			n /= 2;
		}
		return cnt;
	}
}// end of class