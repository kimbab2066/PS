package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P2468_2 {
	static int N, maxCnt;
	static int[][] arr;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static Queue<int[]> q = new LinkedList<>();
	static int[][] vis;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = new int[N][N];
		// value in arr
		int maxLimit = 0;
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.valueOf(str[j]);
				maxLimit = Math.max(maxLimit, arr[i][j]);
			}
		}
		// logic
		for (int limit = 0; limit <= maxLimit; limit++) {
			vis = new int[N][N];
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] > limit && vis[i][j] == 0) {
						cnt += dfs(i, j, limit);
//						cnt += bfs(i, j, limit);
					}
				}
			}
			maxCnt = Math.max(cnt, maxCnt);
		}
		// output
		System.out.println(maxCnt);
	}// main

	static int dfs(int i, int j, int limit) {
		vis[i][j] = 1;
		for (int d = 0; d < 4; d++) {
			int nx = i + dx[d];
			int ny = j + dy[d];
			if (nx < 0 || ny < 0 || nx >= N || ny >= N)
				continue;
			if (vis[nx][ny] == 1)
				continue;
			if (arr[nx][ny] > limit)
				dfs(nx, ny, limit);
		}
		return 1;
	}// dfs

	static int bfs(int i, int j, int limit) {
		vis[i][j] = 1;
		q.add(new int[] { i, j });
		while (!q.isEmpty()) {
			int[] node = q.poll();
			int x = node[0];
			int y = node[1];
			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				if (nx < 0 || ny < 0 || nx >= N || ny >= N)
					continue;
				if (vis[nx][ny] == 1)
					continue;
				if (arr[nx][nx] > limit) {
					vis[nx][ny] = 1;
					q.add(new int[] { nx, ny });
				}
			}
		} // while
		return 1;
	}// bfs
}
// class