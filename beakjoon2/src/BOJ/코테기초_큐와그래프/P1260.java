package BOJ.코테기초_큐와그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P1260 {
	static int[][] check;
	static boolean[] visited;
	static int N;
	static int M;
	static int V;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 첫째 줄에 정점의 개수 N, 간선의 개수 M, 탐색을 시작할 정점의 번호 V가 주어진다.
		 */
		String[] str = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		M = Integer.valueOf(str[1]);
		V = Integer.valueOf(str[2]);
		visited = new boolean[N + 1];
		check = new int[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			str = br.readLine().split(" ");
			int u = Integer.valueOf(str[0]);
			int v = Integer.valueOf(str[1]);
			check[u][v] = check[v][u] = 1;
		}
		dfs(V);
		visited = new boolean[N + 1];
		System.out.println();
		bfs(V);
	}// end of main

	static void dfs(int cur) {
		visited[cur] = true;
		System.out.print(String.valueOf(cur) + " ");
		for (int i = 1; i <= N; i++) {
			if (visited[i] || check[cur][i] != 1) {
				continue;
			}
			dfs(i);
		}
	}

	static void bfs(int cur) {
		Queue<Integer> q = new LinkedList<>();
		visited[cur] = true;
		q.add(cur);
		while (!q.isEmpty()) {
			int here = q.poll();
			System.out.print(String.valueOf(here) + " ");
			for (int there = 1; there <= N; there++) {
				if (visited[there] || check[here][there] != 1) {
					continue;
				}
				visited[there] = true;
				q.add(there);
			}
		}
	}
}// end of class