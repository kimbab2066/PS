package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P7562_2 {
	static StringBuilder sb = new StringBuilder();
	static int[][] chess = new int[301][301];
	static int[] dx = { -1, -2, -2, -1, 1, 2, 2, 1 };
	static int[] dy = { -2, -1, 1, 2, -2, -1, 1, 2 };
	static Queue<int[]> q = new LinkedList<>();
	static int rx, ry, I;// 도착지

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		while (T-- > 0) {
			I = Integer.valueOf(br.readLine());
			// 초기 값 설정
			for (int i = 0; i < I; i++) {
				Arrays.fill(chess[i], -1);
			}
			// 시작위치
			String[] str = br.readLine().split(" ");
			int x = Integer.valueOf(str[0]);
			int y = Integer.valueOf(str[1]);
			chess[x][y] = 0;
			q.add(new int[] { x, y });
			str = br.readLine().split(" ");
			// 도착위치
			rx = Integer.valueOf(str[0]);
			ry = Integer.valueOf(str[1]);
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
				if (nx < 0 || ny < 0 || nx >= I || ny >= I) continue;
				// 방문 한 경우
				if (chess[nx][ny] >= 0) continue;
				chess[nx][ny] = chess[x][y] + 1;
				q.add(new int[] { nx, ny });
			}
		} // while
		return chess[rx][ry];
	}// bfs
}// class