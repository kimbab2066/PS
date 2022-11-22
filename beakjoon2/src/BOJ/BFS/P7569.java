package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7569 {
	static int M, N, H;
	static int[] dx = { 0, 0, 1, -1, 0, 0 };
	static int[] dy = { 1, -1, 0, 0, 0, 0 };
	static int[] dz = { 0, 0, 0, 0, 1, -1 };
	static int[][][] tomato = new int[101][101][101];
	static boolean[][][] vis = new boolean[101][101][101];
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.valueOf(st.nextToken());
		N = Integer.valueOf(st.nextToken());
		H = Integer.valueOf(st.nextToken());
		// value in arr
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < M; k++) {
					tomato[i][j][k] = Integer.valueOf(st.nextToken());
					if (tomato[i][j][k] == 1)
						q.add(new int[] { i, j, k });
				}
			}
		}
		// output
		System.out.println(bfs());
	}// main

	static int bfs() {
		while (!q.isEmpty()) {
			int[] d = q.poll();
			int x = d[1];
			int y = d[2];
			int z = d[0];
			for (int i = 0; i < 6; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				int nz = z + dz[i];
				// 범위를 벗어나는 경우
				if (nx < 0 || ny < 0 || nz < 0 || nx >= N || ny >= M || nz >= H)
					continue;
				// 익지 않은 경우
				if (tomato[nz][nx][ny] == 0) {
					q.add(new int[] { nz, nx, ny });
					tomato[nz][nx][ny] = tomato[z][x][y] + 1;
				}
			}
		}
		int max = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (tomato[i][j][k] == 0) return -1;
					max = Math.max(max, tomato[i][j][k]);
				}
			}
		}
		return max - 1;
	}// bfs
}// class