package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class P2667 {
	static int N;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int[][] house = new int[25][25];
	static boolean[][] vis = new boolean[25][25];
	static ArrayList<Integer> list = new ArrayList<>();
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		//value in house
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				house[i][j] = Integer.valueOf(str.charAt(j) - '0');
			}
		}
		//bfs
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (house[i][j] == 1 && !vis[i][j]) {
					vis[i][j] = true;
					q.add(new int[] { i, j });
					bfs();
				}
			}
		}
		// output
		System.out.println(list.size());
		Collections.sort(list);
		for (int val : list) System.out.println(val);
	}// main

	static void bfs() {
		int cnt = 1;
		while (!q.isEmpty()) {
			int[] node = q.poll();
			int x = node[0];
			int y = node[1];
			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				// 범위를 벗어나는 경우
				if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
				// 집이 없거나 방문한 경우
				if (house[nx][ny] == 0 || vis[nx][ny]) continue;
				q.add(new int[] { nx, ny });
				vis[nx][ny] = true;
				cnt++;
			}
		} // while
		list.add(cnt);
	}// bfs
}// class