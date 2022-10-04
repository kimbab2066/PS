package BOJ.코테기초_큐와그래프;

import java.io.*;
import java.util.*;

public class P13023_2 {
	static int N, M;
	static ArrayList<Integer>[] list;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		M = Integer.valueOf(str[1]);
		list = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			list[i] = new ArrayList<>();
		}
		visited = new boolean[N];
		// 양방향 + DFS
		for (int i = 0; i < M; i++) {
			str = br.readLine().split(" ");
			int a = Integer.valueOf(str[0]);
			int b = Integer.valueOf(str[1]);
			list[a].add(b);
			list[b].add(a);
		}
		// DFS
		int result = 0;
		for (int i = 0; i < N; i++) {// 완전 탐색
			visited[i] = true;
			dfs(i, 0);
			visited[i] = false;
		}
		System.out.println(result);
	}// end of main

	static void dfs(int idx, int depth) {
		if (depth >= 4) {// 4는 A,B,C,D,E인 관계를 찾는 깊이를 의미
			System.out.println(1);
			System.exit(0);
		}
		for (int i : list[idx]) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(i, depth + 1);
				visited[i] = false;
			}
		}
	}
}// end of class