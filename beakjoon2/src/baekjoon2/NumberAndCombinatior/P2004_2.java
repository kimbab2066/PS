package baekjoon2.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P2004_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		long n = Integer.valueOf(str[0]);
		long m = Integer.valueOf(str[1]);

		long five = five_pow(n) - five_pow(n - m) - five_pow(m);
		long two = two_pow(n) - two_pow(n - m) - two_pow(m);
		System.out.println(Math.min(five, two));
	}// end of main

	static long five_pow(long num) {
		int cnt = 0;
		while (num >= 5) {
			cnt += num / 5;
			num /= 5;
		}
		return cnt;
	}

	static long two_pow(long num) {
		int cnt = 0;
		while (num >= 2) {
			cnt += num / 2;
			num /= 2;
		}
		return cnt;
	}
}// end of class
