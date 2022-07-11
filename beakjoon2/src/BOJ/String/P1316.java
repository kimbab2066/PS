package BOJ.String;

import java.util.Scanner;

public class P1316 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int N = in.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (check()) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}// end of main

	static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = in.next();

		for (int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);

			if (prev != now) {
				if (!check[now - 'a']) {
					check[now - 'a'] = true;
					prev = now;
				} else {
					return false;
				}
			}
		}
		return true;
	}// end of check

}// end of class

// 각 문자가 연속해서 나와야함
// first 단어의 개수 N
// second~ N개의 단어
// word is alphabet small letter, reduplication x, maxLength = 100
