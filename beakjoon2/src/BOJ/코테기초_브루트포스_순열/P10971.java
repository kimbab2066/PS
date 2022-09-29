package BOJ.코테기초_브루트포스_순열;

import java.io.*;
import java.util.*;

public class P10971 {
	static int N;
	static int[][] w;
	static boolean[] visited;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/**
		 * TSP(Traveling Salesman Problem)
		 * 
		 * 1 to N number, W[i][j] = cost
		 * 
		 * W[i][j] != W[j][i], W[i][i] = 0
		 */
		N = Integer.valueOf(br.readLine());
		w = new int[N][N];
		visited = new boolean[N];
		for (int i = 0; i < N; i++) {
			w[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		}

		for (int i = 0; i < N; i++) {
			dfs(i, i, 0, 0);
		}
		System.out.println(min);
	}// end of main

	static void dfs(int start, int now, int cnt, int sum) {
		if (cnt == N && start == now) {// depth가 끝자락에 도달하고 처음 위치로 돌아올 때
			min = Math.min(min, sum);
			return;
		}
		// 여기서 탐색
		for (int i = 0; i < N; i++) {
			if (w[now][i] == 0) continue; // [i][i] = 0이니 continue
			if (!visited[i] && w[now][i] > 0) { // 방문X && 값이 0보다 클 때
				visited[i] = true;
				sum += w[now][i];
				dfs(start, i, cnt + 1, sum);
				visited[i] = false;
				sum -= w[now][i];
			}
		}
	}
}// end of class