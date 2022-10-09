package BOJ.코테기초_큐와그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P2178 {
	static int n, m;
	static int[][] arr;
	static boolean[][] visited;
	static int answer = 0;
	static int[] dx = { -1, 1, 0, 0 };// 상하
	static int[] dy = { 0, 0, -1, 1 };// 좌우

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		n = Integer.valueOf(str[0]);
		m = Integer.valueOf(str[1]);
		arr = new int[n][m];
		visited = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			arr[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::valueOf).toArray();
		}
		visited[0][0] = true;
		bfs(0, 0);
		System.out.println(arr[n - 1][m - 1]);
	}// end of main

	static void bfs(int x, int y) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(x, y));
		while (!q.isEmpty()) {
			Point p = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
					continue;
				}
				if (visited[nx][ny] || arr[nx][ny] == 0) {
					continue;
				}
				q.add(new Point(nx, ny));
				arr[nx][ny] = arr[p.x][p.y] + 1;
				visited[nx][ny] = true;
			}
		}
	}
}// end of class

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}