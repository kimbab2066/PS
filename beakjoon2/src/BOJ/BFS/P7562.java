package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P7562 {
	static int[] dx = { 2, 1, -1, -2, -2, -1, 1, 2 };
	static int[] dy = { 1, 2, 2, 1, -1, -2, -2, -1 };
	static Queue<int[]> q = new LinkedList<>();
	static int[][] chess = new int[301][301];
	static int I;
	static int[] res = new int[2];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 배열 확인
		int T = Integer.valueOf(br.readLine());

		while (T-- > 0) {
			I = Integer.valueOf(br.readLine());
			for (int i = 0; i < I; i++) {
				Arrays.fill(chess[i], -1);
			}
			// 시작 위치
			String[] str = br.readLine().split(" ");
			int x = Integer.valueOf(str[0]);
			int y = Integer.valueOf(str[1]);
			chess[x][y] = 0;
			q.add(new int[] { x, y });
			// 도착 위치
			String[] str2 = br.readLine().split(" ");
			res[0] = Integer.valueOf(str2[0]);
			res[1] = Integer.valueOf(str2[1]);
			sb.append(bfs() + "\n");
		} // while
		System.out.println(sb);
	}// main

	static int bfs() {
		while (!q.isEmpty()) {
			int[] node = q.poll();
			int x = node[0];
			int y = node[1];
			for (int d = 0; d < 8; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				// 범위를 벗어나는 경우
				if (nx < 0 || ny < 0 || nx >= I || ny >= I)
					continue;
				// 방문한 경우
				if (chess[nx][ny] >= 0)
					continue;
				chess[nx][ny] = chess[x][y] + 1;
				q.add(new int[] { nx, ny });
			}
		}
		return chess[res[0]][res[1]];
	}// bfs
}// class