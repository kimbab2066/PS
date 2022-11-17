package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1012_3 {
	static StringBuilder sb = new StringBuilder();
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int M, N, K;
	static int[][] cabbage = new int[51][51];
	static boolean[][] vis = new boolean[51][51];
	static Queue<int[]> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.valueOf(st.nextToken());
			N = Integer.valueOf(st.nextToken());
			K = Integer.valueOf(st.nextToken());
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.valueOf(st.nextToken());
				int b = Integer.valueOf(st.nextToken());
				cabbage[a][b] = 1;
			}
			int cnt = 0;
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (cabbage[i][j] == 1 && !vis[i][j]) {
						bfs(i, j);
						cnt++;
					}
				}
			}
			sb.append(cnt + "\n");
			// 초기화
			cabbage = new int[51][51];
			vis = new boolean[51][51];
		} // end of while

		// output
		System.out.println(sb);
	}// end of main

	static void bfs(int x, int y) {
		vis[x][y] = true;
		q.add(new int[] { x, y });
		while (!q.isEmpty()) {
			int[] node = q.poll();
			for (int d = 0; d < 4; d++) {
				int nx = node[0] + dx[d];
				int ny = node[1] + dy[d];
				// 범위를 벗어나는 경우
				if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
				// 방문 했거나 배추가 없는 경우
				if (vis[nx][ny] || cabbage[nx][ny] == 0) continue;
				vis[nx][ny] = true;
				q.add(new int[] { nx, ny });
			}
		} // end of while
	}// end of bfs
}// end of class