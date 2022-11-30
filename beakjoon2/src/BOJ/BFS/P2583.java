package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2583 {
	static int M, N, K;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int[][] area;
	static Queue<int[]> q = new LinkedList<>();
	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		area = new int[M][N];
		// 직사각형 만들기
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int ax = Integer.valueOf(st.nextToken());
			int ay = Integer.valueOf(st.nextToken());
			int bx = Integer.valueOf(st.nextToken());
			int by = Integer.valueOf(st.nextToken());
			for (int j = ax; j < bx; j++) {
				for (int k = ay; k < by; k++) {
					area[j][k] = 1;
				}
			}
		}
		// bfs
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (area[i][j] == 0) {
					q.add(new int[] { i,j });
					bfs();
				}
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		for (int val : list) System.out.print(val + " ");
	}// main

	static void bfs() {
		int cnt = 0;
		while (!q.isEmpty()) {
			int[] node = q.poll();
			for (int d = 0; d < 4; d++) {
				int nx = node[0] + dx[d];
				int ny = node[1] + dy[d];
				// 범위를 벗어나는 경우
				if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
				if(area[nx][ny] == 1) continue;
				area[nx][ny] = 1;
				q.add(new int[] { nx, ny });
				cnt++;
			}
		} // while
		if(cnt == 0)list.add(1);
		else list.add(cnt);
	}// bfs
}// class