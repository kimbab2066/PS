package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P10026 {
	static char[][] color = new char[100][100];
	static boolean[][] vis = new boolean[100][100];
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int N, cnt;
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());

		// value in array
		for (int i = 0; i < N; i++) {
			color[i] = br.readLine().toCharArray();
			for (int j = 0; j < N; j++) {
				if (color[i][j] == 'R') {
					bfs(i, j);
				} else if (color[i][j] == 'G') {
					bfs(i, j);
				} else if (color[i][j] == 'B') {
					bfs(i, j);
				}
			}
		} //
		System.out.println(cnt);
	}// main

	static void bfs(int x, int y) {
		q.add(new int[] { x, y });
		vis[x][y] = true;
		while (!q.isEmpty()) {
			int[] node = q.poll();
			for (int d = 0; d < 4; d++) {
				int nx = node[0] + dx[d];
				int ny = node[1] + dy[d];
				// 범위를 벗어나는 경우
				if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
				if (vis[nx][ny] || color[x][y] != color[nx][ny]) continue;
				vis[nx][ny] = true;
				q.add(new int[] { nx, ny });
			}
		}// while
	}// bfs
}// class