package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P5427 {
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static Queue<int[]> fire = new LinkedList<>();
	static Queue<int[]> sg = new LinkedList<>();

	static int[][] arr = new int[1001][1001];
	static int[][] vis1 = new int[1001][1001];// fire
	static int[][] vis2 = new int[1001][1001];// sg
	static StringBuilder sb = new StringBuilder();
	static int W, H;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		while (T-- > 0) {
			String[] str = br.readLine().split(" ");
			W = Integer.valueOf(str[0]);
			H = Integer.valueOf(str[1]);
			arr = new int[H][W];
			// 시작위치,불위치,벽위치 찾기
			for (int i = 0; i < H; i++) {
				String s = br.readLine();
				for (int j = 0; j < W; j++) {
					char ch = s.charAt(j);
					if (ch == '#') arr[i][j] = -1;
					else if (ch == '*') {
						fire.add(new int[] { i, j });
						vis1[i][j] = 1;
					} else if (ch == '@') {
						sg.add(new int[] { i, j });
						vis2[i][j] = 1;
					}
				}
			}
			sb.append(bfs()+"\n");
		} // while
		System.out.println(sb);
	}// main

	static String bfs() {
		// 불
		while (!fire.isEmpty()) {
			int[] node = fire.poll();
			int x = node[0];
			int y = node[1];
			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				// 범위를 벗어나는 경우
				if (nx < 0 || ny < 0 || nx >= H || ny >= W) continue;
				// 방문했거나 벽(-1)인 경우
				if (vis1[nx][ny] >= 1 || arr[nx][ny] == -1) continue;
				vis1[nx][ny] = vis1[x][y] + 1;
				fire.add(new int[] { nx, ny });
			}
		} // while
		
		// 상근
		while (!sg.isEmpty()) {
			int[] node = sg.poll();
			int x = node[0];
			int y = node[1];
			for (int d = 0; d < 4; d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				// 범위를 벗어나는 경우(탈출 가능)
				if (nx < 0 || ny < 0 || nx >= H || ny >= W) {
					return vis2[x][y] + " ";
				}
				// 방문했거나 벽(-1)인 경우
				if (vis2[nx][ny] >= 1 || arr[nx][ny] == -1) continue;
				// 불보다 늦게 온 경우(숫자가 큰 경우)
				if (vis1[nx][ny] <= vis2[x][y] + 1) continue;
				vis2[nx][ny] = vis2[x][y] + 1;
				sg.add(new int[] { nx, ny });
			}
		} // while
		return "IMPOSSIBLE";
	}// bfs
}// class
/*
 * 1.불이 이동하고 상근이가 이동한다. 즉, Queue가 2개 필요하다는 의미
 * 
 * 2. @(시작위치), *을 각각 큐에 넣는다.if . then
 * 
 * 3.bfs 이동할 때 마다 1씩 증가하고, 범위를 벗어나는 경우 탈출 가능 or 탈출이 안되면 IMPOSSIBLE
 */