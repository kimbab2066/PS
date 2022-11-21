package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P10026 {
	static char[][] color = new char[101][101];
	static boolean[][] vis = new boolean[101][101];
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int N;
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());

		// value in array
		for (int i = 0; i < N; i++) {
			color[i] = br.readLine().toCharArray();
		}
		// 색약 아닌 사람
		int not_color = color();
		// 방문 배열 초기화
		vis = new boolean[101][101];
		//
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (color[i][j] == 'G') {
					color[i][j] = 'R';
				}
			}
		} //
		int color = color();

		System.out.println(not_color + " " + color);
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
				if (nx < 0 || ny < 0 || nx >= N || ny >= N)
					continue;
				if (vis[nx][ny] || color[x][y] != color[nx][ny])
					continue;
				vis[nx][ny] = true;
				q.add(new int[] { nx, ny });
			}
		} // while
	}// bfs

	static int color() {
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!vis[i][j]) {
					cnt++;
					bfs(i, j);
				}
			}
		}
		return cnt;
	}// not_color
}// class