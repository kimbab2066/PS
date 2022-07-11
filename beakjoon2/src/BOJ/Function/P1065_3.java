package BOJ.Function;

import java.util.Scanner;

public class P1065_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(arithmetic_sequence(N));

	}// end of main

	static int arithmetic_sequence(int N) {
		if (N < 100) return N;
		else {
			int cnt = 99;
			//if (N == 1000) N = 999;
			for (int i = 100; i <= N; i++) {
				int h = i / 100;
				int t = (i / 10) % 10;
				int s = i % 10;
				if ((h - t) == (t - s)) {
					cnt++;
				}
			}
			return cnt;
		}
	}// end of arithmetic_sequence
}// end of class