package BOJ.코테기초_브루트포스;

import java.io.*;
import java.util.*;

public class P3085 {
	static int max = 0, N;
	static char map[][];

	public static void main(String[] args) throws IOException {
		/*
		 * 가장 처음에 N×N크기에 사탕을 채워 놓는다. 사탕의 색은 모두 같지 않을 수도 있다. 상근이는 사탕의 색이 다른 인접한 두 칸을 고른다.
		 * 
		 * 그 다음 고른 칸에 들어있는 사탕을 서로 교환한다.
		 * 
		 * 이제, 모두 같은 색으로 이루어져 있는 가장 긴 연속 부분(행 또는 열)을 고른 다음 그 사탕을 모두 먹는다.
		 * 
		 * 첫째 줄에 보드의 크기 N이 주어진다. (3 ≤ N ≤ 50)
		 * 
		 * 다음 N개 줄에는 보드에 채워져 있는 사탕의 색상이 주어진다. 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y로 주어진다.
		 * 
		 * 사탕의 색이 다른 인접한 두 칸이 존재하는 입력만 주어진다.
		 * 
		 * 첫째 줄에 상근이가 먹을 수 있는 사탕의 최대 개수를 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		map = new char[N][N];

		// value in map
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				char tmp = map[i][j];
				map[i][j] = map[i][j + 1];
				map[i][j + 1] = tmp;

				check(map);

				tmp = map[i][j];
				map[i][j] = map[i][j + 1];
				map[i][j + 1] = tmp;

			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				char tmp = map[j][i];
				map[j][i] = map[j + 1][i];
				map[j + 1][i] = tmp;

				check(map);
				tmp = map[j][i];
				map[j][i] = map[j + 1][i];
				map[j + 1][i] = tmp;
			}
		}
		System.out.println(max);
	}// end of main

	static void check(char[][] map) {
		for (int i = 0; i < N; i++) {
			int cnt = 1;
			for (int j = 0; j < N - 1; j++) {
				if (map[i][j] == map[i][j + 1]) {
					cnt++;
				} else {
					cnt = 1;
				}
				max = Math.max(max, cnt);
			}
		}
		for (int i = 0; i < N; i++) {
			int cnt = 1;
			for (int j = 0; j < N - 1; j++) {
				if (map[j][i] == map[j + 1][i]) {
					cnt++;
				} else {
					cnt = 1;
				}
				max = Math.max(max, cnt);
			}
		}
	}// end of check
}// end of class