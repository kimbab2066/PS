package BOJ.코테기초_브루트포스_순열;

import java.io.*;
import java.util.Arrays;

public class P2098 {
	static int N;
	static int[][] w;
	static boolean[] visited;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
		if (start == now && cnt == N) {
			min = Math.min(min, sum);
			return;
		}
		for (int i = 0; i < N; i++) {
			if (w[now][i] == 0) continue;
			if (!visited[i] && w[now][i] > 0) {
				visited[i] = true;
				sum += w[now][i];
				dfs(start, i, cnt + 1, sum);
				visited[i] = false;
				sum -= w[now][i];
			}
		}
	}// end of dfs

}// end of class