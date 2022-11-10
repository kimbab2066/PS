package BOJ.그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1926 {
	static int[][] edge = new int[501][501];
	static boolean[][] visited = new boolean[501][501];
	static int N, M, cnt, max;
	static Queue<Node> q;
	// 상 하 좌 우
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				edge[i][j] = Integer.valueOf(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				// 색칠이 안된 부분이거나 방문한 경우는 패스
				if (edge[i][j] == 0 || visited[i][j]) continue;
				cnt++;
				bfs(i, j);
			}
		}
		// 그림의 개수, 넓이 출력
		System.out.println(cnt + "\n" + max);
	}// end of main

	static void bfs(int x, int y) {
		visited[x][y] = true;
		q = new LinkedList<>();
		q.add(new Node(x, y));
		int area = 0;// 그림의 넓이
		while (!q.isEmpty()) {
			area++;
			Node node = q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				// 예외 1. 범위가 아닌 경우
				if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
				// 예외 2. 방문했거나, 색칠이 안된 경우
				if (visited[nx][ny] || edge[nx][ny] == 0) continue;
				visited[nx][ny] = true;
				q.add(new Node(nx, ny));
			}
		} // end of while
		max = Math.max(max, area);
	}// end of bfs
}// end of class

class Node {
	int x, y;

	Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}// end of Node