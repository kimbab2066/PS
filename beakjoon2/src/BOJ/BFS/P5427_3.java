package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P5427_3 {
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int[][] arr = new int[1001][1001];
	static int[][] visF = new int[1001][1001];
	static int[][] visS = new int[1001][1001];
	static Queue<int[]> qF = new LinkedList<>();
	static Queue<int[]> qS = new LinkedList<>();
	static int W, H;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		while (T-- > 0) {
			String[] str = br.readLine().split(" ");
			W = Integer.valueOf(str[0]);
			H = Integer.valueOf(str[1]);
			// 초기화
			for (int i = 0; i < H; i++) {
				Arrays.fill(arr[i], 0);
				Arrays.fill(visF[i], 0);
				Arrays.fill(visS[i], 0);
			}
			for (int i = 0; i < H; i++) {
				String s = br.readLine();
				for (int j = 0; j < W; j++) {
					char ch = s.charAt(j);
					if (ch == '#') arr[i][j] = -1;
					else {
						if (ch == '*') {
							qF.add(new int[] { i, j });
							visF[i][j] = 1;
						} else if (ch == '@') {
							qS.add(new int[] { i, j });
							visS[i][j] = 1;
						}
					}
				}
			}
			sb.append(bfs());
		} // while
		System.out.println(sb);
	}// main

	static String bfs() {
		// Fire
		while (!qF.isEmpty()) {
			int[] node = qF.poll();
			int x = node[0];
			int y = node[1];
			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				// 범위를 벗어나는 경우
				if (nx < 0 || ny < 0 || nx >= H || ny >= W) continue;
				// 벽이거나 방문한 경우
				if (arr[nx][ny] == -1 || visF[nx][ny] >= 1) continue;
				visF[nx][ny] = visF[x][y] + 1;
				qF.add(new int[] { nx, ny });
			}
		}
		// Sg
		while (!qS.isEmpty()) {
			int[] node = qS.poll();
			int x = node[0];
			int y = node[1];
			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				// 범위를 벗어나는 경우(탈출 가능)
				if (nx < 0 || ny < 0 || nx >= H || ny >= W) {
					return String.valueOf(visS[x][y]) + "\n";
				}
				// 벽이거나 방문한 경우
				if (arr[nx][ny] == -1 || visS[nx][ny] >= 1) continue;
				// 불보다 늦게 온 경우
				if (visF[nx][ny] != 0 && visF[nx][ny] <= visS[x][y] + 1) continue;
				visS[nx][ny] = visS[x][y] + 1;
				qS.add(new int[] { nx, ny });
			}
		}
		return "IMPOSSIBLE\n";
	}// bfs
}// class