package BOJ.코테기초_브루트포스_재귀;

import java.io.*;
import java.util.*;

public class P15661_2 {
	static int N, M;// M is Member
	static int[][] map;
	static boolean[] visited;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		map = new int[N][N];
		visited = new boolean[N];
		// value in map
		for (int i = 0; i < N; i++) {
			map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		}
		for (M = 1; M < N; M++) {// 모든 경우의 수 탐색.
			bfs(0, 0);
		}
		System.out.println(min);
	}// end of main

	static void bfs(int idx, int depth) {
		if (depth == M) {
			min = Math.min(min, check());
			if (min == 0) {
				System.out.println(min);
				System.exit(0);
			}
			return;
		}
		for (int i = idx; i < N; i++) {
			visited[i] = true;
			bfs(i + 1, depth + 1);
			visited[i] = false;
		}
	}// end of bfs

	static int check() {
		int link = 0;// false
		int start = 0;// true
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (visited[i] && visited[j]) {
					start += map[i][j] + map[j][i];
				} else if (!visited[i] && !visited[j]) {
					link += map[i][j] + map[j][i];
				}
			}
		}
		return Math.abs(link - start);
	}// end of check
}// end of class