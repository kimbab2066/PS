package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7576 {
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int[][] tomato;
	static int M, N, day;
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		M = Integer.valueOf(st.nextToken());
		N = Integer.valueOf(st.nextToken());
		tomato = new int[N][M];
		// 0은 익지 않은 토마토, 1은 익은 토마토, -1은 토마토가 없는 칸
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				tomato[i][j] = Integer.valueOf(st.nextToken());
				if (tomato[i][j] == 1) q.add(new int[] { i, j });
			}
		}
		System.out.println(bfs());
	}// end of main

	static int bfs() {
		while (!q.isEmpty()) {
			int[] d = q.poll();
			int x = d[0];
			int y = d[1];
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				// 범위를 벗어나는 경우
				if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
				// 익지 않은 경우
				if (tomato[nx][ny] == 0) {
					q.add(new int[] { nx, ny });
					tomato[nx][ny] = tomato[x][y] + 1;
				}
			}
		}
		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (tomato[i][j] == 0) return -1;
				max = Math.max(max, tomato[i][j]);
			}
		}
		if(max == 1) return 0;
		else return max - 1;
	}// end of bfs
}// end of class
