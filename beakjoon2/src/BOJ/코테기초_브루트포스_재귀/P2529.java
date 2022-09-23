package BOJ.코테기초_브루트포스_재귀;

import java.io.*;
import java.util.*;

public class P2529 {
	static int K;
	static boolean[] visited = new boolean[10];// 숫자 범위 : 0~9
	static char[] c;
	static List<String> result = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 두 종류의 부등호 기호 ‘<’와 ‘>’가 k개 나열된 순서열 A가 있다.
		 * 
		 * 이 부등호 기호 앞뒤에 서로 다른 한 자릿수 숫자를 넣어서 모든 부등호 관계를 만족시키려고 한다.
		 * 
		 * 제시된 k개의 부등호 순서를 만족하는 (k+1)자리의 정수 중에서 최댓값과 최솟값을 찾아야 한다.
		 * 
		 * 부등호의 앞뒤에 들어가는 숫자는 { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }중에서 선택 후 선택된 숫자는 모두 달라야 함.
		 * 
		 * 첫 줄에 부등호 문자의 개수를 나타내는 정수 k가 주어짐.
		 * 
		 * 그 다음 줄에는 k개의 부등호 기호가 하나의 공백을 두고 한 줄에 모두 제시됨. k의 범위는 2 ≤ k ≤ 9.
		 * 
		 * k+1 자리의 최대, 최소 정수를 첫째 줄과 둘째 줄에 각각 출력.
		 */

		K = Integer.valueOf(br.readLine());
		c = new char[K];
		StringTokenizer st = new StringTokenizer(br.readLine());
		// value in c
		for (int i = 0; i < K; i++) {
			c[i] = st.nextToken().charAt(0);
		}
		dfs("", 0);//리턴받을 문자열, 인덱스
		//Collections.sort(result);
		System.out.println(result.get(result.size() - 1));// max
		System.out.println(result.get(0));// min
	}// end of main

	static void dfs(String num, int depth) {
		if (depth == K + 1) {// 부등호가 K개라 K+1까지
			result.add(num);
			return;
		}
		// 0 to 9 search
		for (int i = 0; i < 10; i++) {
			if (depth == 0 || !visited[i] && compare(num.charAt(num.length() - 1) - '0', i, c[depth - 1])) {
				visited[i] = true;
				dfs(num + i, depth + 1);
				visited[i] = false;
			}
		}
	}// end of bfs

	/**
	 * @param a {number}
	 * @param b {i}
	 * @param c {operation}
	 * @return boolean
	 */
	static boolean compare(int a, int b, char c) {
		if (c == '<') return a < b;
		return a > b;
	}// end of compare
}// end of class