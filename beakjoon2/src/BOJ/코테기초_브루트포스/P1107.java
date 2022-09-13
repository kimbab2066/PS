package BOJ.코테기초_브루트포스;

import java.io.*;
import java.util.*;

public class P1107 {
	static boolean[] button;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 첫째 줄에 수빈이가 이동하려고 하는 채널 N (0 ≤ N ≤ 500,000)이 주어진다.
		 * 
		 * 둘째 줄에는 고장난 버튼의 개수 M (0 ≤ M ≤ 10)이 주어진다.
		 * 
		 * 고장난 버튼이 있는 경우에는 셋째 줄에는 고장난 버튼이 주어지며, 같은 버튼이 여러 번 주어지는 경우는 없다.
		 */
		int N = Integer.valueOf(br.readLine());
		int M = Integer.valueOf(br.readLine());

		button = new boolean[10];
		if (M != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				int notUse = Integer.valueOf(st.nextToken());
				button[notUse] = true;
			}
		}

		int min = Math.abs(N - 100);
		for (int i = 0; i < 1_000_000; i++) {
			int len = check(i);
			if (len > 0) {
				int buttonPress = Math.abs(N - i);
				min = Math.min(min, buttonPress + len);
			}
		}
		System.out.println(min);
	}// end of main

	static int check(int n) {
		if (n == 0) {
			if (button[0]) {
				return 0;// false
			} else {
				return 1;// true
			}
		}
		int len = 0;
		while (n > 0) {
			if (button[n % 10]) {// true == isBreak
				return 0;
			}
			n /= 10;
			len += 1;
		}
		return len;
	}// end of check
}// end of class