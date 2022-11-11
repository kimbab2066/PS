package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1926_2 {

	static int n, m;
	static int[][] edge;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.valueOf(st.nextToken());
		m = Integer.valueOf(st.nextToken());

		edge = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				edge[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		visited = new boolean[n][m];
		int cnt = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (edge[i][j] == 1 && !visited[i][j]) {
					max = Math.max(max, bfs(j, i));
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		System.out.println(max);
	}

	static int bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { x, y });
		visited[y][x] = true;
		int size = 1;
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int px = p[0];
			int py = p[1];

			for (int d = 0; d < 4; d++) {
				int nx = px + dx[d];
				int ny = py + dy[d];
				if (nx < 0 || ny < 0 || nx > m - 1 || ny > n - 1)
					continue;
				if (visited[ny][nx])
					continue;
				if (edge[ny][nx] == 1) {
					size++;
					visited[ny][nx] = true;
					q.add(new int[] { nx, ny });
				}
			}
		}
		return size;
	}
}