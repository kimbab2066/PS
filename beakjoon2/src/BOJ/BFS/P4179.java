package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P4179 {
	static char[][] maze = new char[1001][1001];
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static int R, C;
	static Queue<Node> fire = new LinkedList<>();
	static Queue<Node> jh = new LinkedList<>();
	static int[][] dist1 = new int[1001][1001];// fire
	static int[][] dist2 = new int[1001][1001];// jh

	static class Node {
		int x, y;

		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// dx dy , if (nx < 0 || ny < 0 || nx >= R || ny >= C) then Escape
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		//
		
//		// 방문체크용 배열의 초기값 -1
//		for (int i = 0; i < R; i++) {
//			Arrays.fill(dist1[i], -1);
//			Arrays.fill(dist2[i], -1);
//		}
		// maze 배열 값 설정 & F,J의 경우 queue에 넣기
		for (int i = 0; i < R; i++) {
			maze[i] = br.readLine().toCharArray();
			for (int j = 0; j < C; j++) {
				if (maze[i][j] == 'F') {
					dist1[i][j] = 1;
					fire.add(new Node(i, j));
				} else if (maze[i][j] == 'J') {
					dist2[i][j] = 1;
					jh.add(new Node(i, j));
				}
			}
		}
		bfs();
	}// end of main

	static void bfs() {
		// 불
		while (!fire.isEmpty()) {
			Node node = fire.poll();
			for (int d = 0; d < 4; d++) {
				int nx = node.x + dx[d];
				int ny = node.y + dy[d];
				// 범위를 벗어나는 경우
				if (nx < 0 || ny < 0 || nx >= R || ny >= C)
					continue;
				// 방문했거나 벽인 경우
				if (dist1[nx][ny] >= 1 || maze[nx][ny] == '#')
					continue;
				// 이동 시간 증가
				dist1[nx][ny] = dist1[node.x][node.y] + 1;
				fire.add(new Node(nx, ny));
			}
		}
		// 지훈
		while (!jh.isEmpty()) {
			Node node = jh.poll();
			for (int d = 0; d < 4; d++) {
				int nx = node.x + dx[d];
				int ny = node.y + dy[d];
				// 범위를 벗어나면 탈출 성공
				if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
					System.out.println(dist2[node.x][node.y]);
					return;
				}
				// 방문했거나 벽인 경우
				if (dist2[nx][ny] >= 1 || maze[nx][ny] == '#')
					continue;
				// 불의 거리보다 지훈이의 거리가 크거나 같은 경우(불이 지나간 경우)
				if (dist1[nx][ny] != 0 && dist1[nx][ny] <= dist2[node.x][node.y] + 1)
					continue;
				// 이동 시간 증가
				dist2[nx][ny] = dist2[node.x][node.y] + 1;
				jh.add(new Node(nx, ny));
			}
		}
		// 여기까지 도달하면 탈출 불가
		System.out.println("IMPOSSIBLE");
	}// end of bfs
}// end of class