package BOJ.코테기초_브루트포스_N과M;

import java.io.*;
import java.util.*;

public class P18290_2 {
	static int N, M, K, result;
	static int[][] array;
	static boolean[][] visit;
	static StringBuilder sb = new StringBuilder();
	// Top, Right, Down , Left
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 크기가 N×M인 격자판의 각 칸에 정수가 하나씩 들어있다.
		 * 
		 * 첫째 줄에 N, M, K가 주어진다. 둘째 줄부터 N개의 줄에 격자판에 들어있는 수가 주어진다.
		 * 
		 * 선택한 칸에 들어있는 수를 모두 더한 값의 최댓값을 출력한다.
		 */
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		K = Integer.valueOf(st.nextToken());
		array = new int[N][M];
		visit = new boolean[N][M];
		// value in array
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				array[i][j] = Integer.valueOf(st.nextToken());
			}
		}

		bfs(0, 0, 0, 0);
		System.out.println(result);
	}// end of main

	static void bfs(int x, int y, int idx, int sum) {
		if (idx == K) {// index == K ? 무슨 의미?
			result = Math.max(result, sum);
			return;
		} else {
			for (int i = x; i < N; i++) {
				for (int j = y; j < M; j++) {
					if (!visit[i][j]) {// 방문하지 않은 경우
						if (check(i, j)) {
							visit[i][j] = true;
							bfs(x, y, idx + 1, sum + array[i][j]);// sum에 더해주는 이유가 뭘까
							visit[i][j] = false;
						}
					}
				}
			}
		}
	}// end of bfs

	static boolean check(int x, int y) {
		boolean flag = true;
		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M) {
				if (visit[nextX][nextY]) {
					flag = false;
				}
			}
		}
		return flag;
	}// end of check
}// end of class