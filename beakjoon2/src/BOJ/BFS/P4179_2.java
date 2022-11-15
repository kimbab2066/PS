package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P4179_2 {

	static int R, C, result;
	static char maze[][];
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static Queue<Node> fire, jh;

	static class Node {
		int x, y, d;

		public Node(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		maze = new char[R][C];

		fire = new LinkedList<>();
		jh = new LinkedList<>();

		for (int i = 0; i < R; i++) {
			maze[i] = br.readLine().toCharArray();
			for (int j = 0; j < C; j++) {
				// 지훈
				if (maze[i][j] == 'J') {
					jh.add(new Node(i, j, 0));
				}
				// 불
				else if (maze[i][j] == 'F') {
					fire.add(new Node(i, j, 0));
				}
			}
		}
		bfs();
	}// end of main

	private static void bfs() {
		while (!jh.isEmpty()) {
			// 불 먼저
			int size = fire.size();
			for (int i = 0; i < size; i++) {
				Node node = fire.poll();

				for (int d = 0; d < 4; d++) {
					int nx = node.x + dx[d];
					int ny = node.y + dy[d];

					// 범위를 벗어난 경우
					if (nx < 0 || ny < 0 || nx >= R || ny >= C)
						continue;
					// 벽이거나 방문한 곳인 경우
					if (maze[nx][ny] == '#' || maze[nx][ny] == 'F')
						continue;

					maze[nx][ny] = 'F';
					fire.add(new Node(nx, ny, node.d + 1));
				}
			}
			// 지훈이 이동
			size = jh.size();
			for (int i = 0; i < size; i++) {
				Node node = jh.poll();

				for (int d = 0; d < 4; d++) {
					int nx = node.x + dx[d];
					int ny = node.y + dy[d];

					// 범위를 벗어나면 탈출
					if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
						System.out.println( node.d + 1);
						return ;
					}

					// 벽이거나 불이거나 방문한 곳인 경우
					if (maze[nx][ny] == '#' || maze[nx][ny] == 'F' || maze[nx][ny] == 'J')
						continue;

					maze[nx][ny] = 'J';
					jh.add(new Node(nx, ny, node.d + 1));
				}
			}
		}
		//여기까지 도달하면 안됨
		System.out.println("IMPOSSIBLE");
	}//end of bfs
}// end of class