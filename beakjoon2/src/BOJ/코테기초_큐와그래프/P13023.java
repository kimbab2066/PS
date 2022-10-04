package BOJ.코테기초_큐와그래프;

import java.io.*;
import java.util.*;

public class P13023 {
	static int N, M, result = 0;
	static ArrayList<Integer>[] list;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/**
		 * BOJ 알고리즘 캠프에는 총 N명이 참가하고 있다. 사람들은 0번부터 N-1번으로 번호가 매겨져 있고, 일부 사람들은 친구이다.
		 * 
		 * 오늘은 다음과 같은 친구 관계를 가진 사람 A, B, C, D, E가 존재하는지 구해보려고 한다.
		 * 
		 * 첫째 줄에 사람의 수 N (5 ≤ N ≤ 2000)과 친구 관계의 수 M (1 ≤ M ≤ 2000)이 주어진다.
		 * 
		 * 둘째 줄부터 M개의 줄에는 정수 a와 b가 주어지며, a와 b가 친구라는 뜻이다.
		 * 
		 * (0 ≤ a, b ≤ N-1, a ≠ b) 같은 친구 관계가 두 번 이상 주어지는 경우는 없다.
		 * 
		 * 문제의 조건에 맞는 A, B, C, D, E가 존재하면 1을 없으면 0을 출력한다.
		 */
		String str[] = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		M = Integer.valueOf(str[1]);
		visited = new boolean[N];
		list = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			list[i] = new ArrayList<>();
		}
		// 관계 입력
		for (int i = 0; i < M; i++) {
			str = br.readLine().split(" ");
			int a = Integer.valueOf(str[0]);
			int b = Integer.valueOf(str[1]);
			list[a].add(b);
			list[b].add(a);
		}
		// dfs
		for (int i = 0; i < N; i++) {
			if (result == 0) {
				visited[i] = true;
				dfs(i, 0);
				visited[i] = false;
			}
		}
		System.out.println(result);
	}// end of main

	static void dfs(int cnt, int depth) {
		if (depth == 4) {
			result = 1;
			return;
		}
		for (int i : list[cnt]) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(i, depth + 1);
				visited[i] = false;
			}
		}
	}// end of dfs
}// end of class