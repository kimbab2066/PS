package BOJ.코테기초_브루트포스_재귀;

import java.io.*;
import java.util.*;

public class P1759 {
	static int L, C;
	static char[] list, code;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 암호는 서로 다른 L개의 알파벳 소문자들로 구성되며 최소 한 개의 모음(a, e, i, o, u)과 최소 두 개의 자음으로 구성되어 있다.
		 * 
		 * 알파벳이 암호에서 증가하는 순서로 배열되었을 것이라고 추측된다. 즉, abc는 가능성이 있는 암호이지만 bac는 그렇지 않다.
		 * 
		 * 새 보안 시스템에서 조교들이 암호로 사용했을 법한 문자의 종류는 C가지가 있다고 한다.
		 *
		 * C개의 문자들이 모두 주어졌을 때, 가능성 있는 암호들을 모두 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 두 정수 L, C가 주어진다.
		 * 
		 * (3 ≤ L ≤ C ≤ 15) 다음 줄에는 C개의 문자들이 공백으로 구분되어 주어진다.
		 * 
		 * 주어지는 문자들은 알파벳 소문자이며, 중복되는 것은 없다.
		 * 
		 * 각 줄에 하나씩, 사전식으로 가능성 있는 암호를 모두 출력한다.
		 * 
		 * 앞에 N과 M 문제와 비슷하네
		 */
		StringTokenizer st = new StringTokenizer(br.readLine());
		int L = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());

		list = new char[C];
		code = new char[L];
		st = new StringTokenizer(br.readLine());
		// value in arr
		for (int i = 0; i < C; i++) {
			list[i] = st.nextToken().charAt(0);
		}
		Arrays.sort(list);
		dfs(0, 0);
	}// end of main

	static void dfs(int x, int idx) {
		if (idx == L) {
			if (isValid()) {
				System.out.println(code);
			}
			return;
		}
		for (int i = x; i < C; i++) {
			code[idx] = list[i];
			dfs(i + 1, idx + 1);
		}
	}

	// check vowel and consonant
	static boolean isValid() {
		int vowel = 0;
		int consonant = 0;
		for (char x : code) {
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				vowel++;
			} else {
				consonant++;
			}
		}
		if (vowel >= 1 && consonant >= 2) {
			return true;
		}
		return false;
	}// end of isValid
}// end of class