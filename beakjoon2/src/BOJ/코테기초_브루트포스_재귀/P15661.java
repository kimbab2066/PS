package BOJ.코테기초_브루트포스_재귀;

import java.io.*;
import java.util.*;

public class P15661 {
	static int N, M;
	static int[][] map;
	static int result = Integer.MAX_VALUE;
	static StringTokenizer st;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 축구를 하기 위해 모인 사람은 총 N명이다.스타트 팀과 링크 팀으로 사람들을 나눠야 한다.
		 * 
		 * 두 팀의 인원수는 같지 않아도 되지만, 한 명 이상이어야 한다.
		 * 
		 * 스타트 팀의 능력치와 링크 팀의 능력치의 차이를 최소로 하려고 한다.
		 * 
		 * 첫째 줄에 N(4 ≤ N ≤ 20)이 주어진다. 둘째 줄부터 N개의 줄에 S가 주어진다.
		 * 
		 * 각 줄은 N개의 수로 이루어져 있고, i번 줄의 j번째 수는 Sij 이다.
		 * 
		 * Sii는 항상 0이고, 나머지 Sij는 1보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 * 
		 * 첫째 줄에 스타트 팀과 링크 팀의 능력치의 차이의 최솟값을 출력한다.
		 * 
		 * 문제 파악.(BFS)
		 * 
		 * 모든 경우의 수를 다 돌려서 최솟값을 갱신해준다.
		 */
		N = Integer.valueOf(br.readLine());
		map = new int[N][N];
		visited = new boolean[N];
		// value in map
		for (int i = 0; i < N; i++) {
			map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		}
		for (M = 1; M < N; M++) {
			bfs(0, 0);
		}
		System.out.print(result);
	}// end of main

	static void bfs(int depth, int idx) {
		if (depth == M) {
			int link = 0;
			int start = 0;

			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					if (visited[i] && visited[j]) {
						start += map[i][j] + map[j][i];
					} else if (!visited[i] && !visited[j]) {
						link += map[i][j] + map[j][i];
					}
				}
			}
			result = Math.min(result, Math.abs(link - start));
			return;
		}
		for (int i = idx; i < N; i++) {
			visited[i] = true;
			bfs(depth + 1, i + 1);
			visited[i] = false;
		}
	}// end of bfs
}// end of class