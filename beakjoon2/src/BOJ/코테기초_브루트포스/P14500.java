package BOJ.코테기초_브루트포스;

import java.io.*;
import java.util.*;

public class P14500 {
	static int N, M, result;
	static int map[][];
	// 방향벡터 Left Right Up Down
	static int dx[] = { 0, 0, -1, 1 };
	static int dy[] = { -1, 1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 첫째 줄에 종이의 세로 크기 N과 가로 크기 M이 주어진다. (4 ≤ N, M ≤ 500)
		 * 
		 * 둘째 줄부터 N개의 줄에 종이에 쓰여 있는 수가 주어진다.
		 * 
		 * i번째 줄의 j번째 수는 위에서부터 i번째 칸, 왼쪽에서부터 j번째 칸에 쓰여 있는 수이다.
		 * 
		 * 입력으로 주어지는 수는 1,000을 넘지 않는 자연수이다.
		 * 
		 * 첫째 줄에 테트로미노가 놓인 칸에 쓰인 수들의 합의 최댓값을 출력한다.
		 * 
		 * 1안 - 각 칸을 기준으로 5가지 형태의 테트로미노를 메소드를 통해 확인하면서 최대값을 갱신하자.
		 */
		String str[] = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		M = Integer.valueOf(str[1]);
		map = new int[N][M];
		// value in map
		for (int i = 0; i < N; i++) {
			str = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.valueOf(str[j]);
			}
		}

		boolean visit[][] = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				visit[i][j] = true;
				dfs(i, j, 1, map[i][j], visit);
				visit[i][j] = false;
				check(i, j);
			}
		}
		System.out.println(result);
	}// end of main

	static void dfs(int y, int x, int cnt, int sum, boolean[][] visit) {
		if (cnt >= 4) {
			result = Math.max(result, sum);
			return;
		}
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx < 0 || ny < 0 || nx >= M || ny >= N || visit[ny][nx]) {// 범위를 벗어나는 경우
				continue;
			}
			visit[ny][nx] = true;// 방문안함
			dfs(ny, nx, cnt + 1, sum + map[ny][nx], visit);
			visit[ny][nx] = false;// 방문함
		}
	}

	static void check(int y, int x) {
		if (y < N - 2 && x < M - 1) {
			result = Math.max(result, map[y][x] + map[y + 1][x] + map[y + 2][x] + map[y + 1][x + 1]);
		}
		if (y < N - 2 && x > 0) {
			result = Math.max(result, map[y][x] + map[y + 1][x] + map[y + 2][x] + map[y + 1][x - 1]);
		}
		if (y < N - 1 && x < M - 2) {
			result = Math.max(result, map[y][x] + map[y][x + 1] + map[y][x + 2] + map[y + 1][x + 1]);
		}
		if (y > 0 && x < M - 2) {
			result = Math.max(result, map[y][x] + map[y][x + 1] + map[y][x + 2] + map[y - 1][x + 1]);
		}
	}
}// end of class