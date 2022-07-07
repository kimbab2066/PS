package baekjoon2.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P2004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int n = Integer.valueOf(str[0]);
		int m = Integer.valueOf(str[1]);

		int cnt_five = five_pow(n) - five_pow(n - m) - five_pow(m);
		int cnt_two = two_pow(n) - two_pow(n - m) - two_pow(m);
		System.out.println(Math.min(cnt_five, cnt_two));
	}// end of main

	static int five_pow(int num) {
		int cnt = 0;
		while (num >= 5) {
			cnt += num / 5;
			num /= 5;
		}
		return cnt;
	}

	static int two_pow(int num) {
		int cnt = 0;
		while (num >= 2) {
			cnt += num / 2;
			num /= 2;
		}
		return cnt;
	}
}// end of class
