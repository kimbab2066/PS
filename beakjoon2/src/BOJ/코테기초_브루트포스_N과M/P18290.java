package BOJ.코테기초_브루트포스_N과M;

import java.io.*;
import java.util.*;

public class P18290 {
	static int N, M, K;
	static int[][] arr, adjacency;
	static int[] check;
	static StringBuilder sb = new StringBuilder();
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		M = Integer.valueOf(str[1]);
		K = Integer.valueOf(str[2]);
		arr = new int[M][N];
		adjacency = new int[M][N];
		check = new int[K];

		// value in arr
		for (int i = 0; i < N; i++) {
			str = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.valueOf(str[j]);
			}
		}
		dfs(0);
		System.out.println(max);
		// System.out.println(Arrays.deepToString(arr)); // 2차원 배열 출력

		// int max = dfs(0, 0);
		// System.out.println(max);
	}// end of main

	static void dfs(int start) {
		if (start == K) {// start == K ->max value
			int tmp = 0;
			for (int i : check) {
				tmp += i;
			}
			max = Math.max(tmp, max);
		} else {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (adjacency[i][j] > 0) {
						continue;
					}
					go(i, j);// adjacency check
					check[start] = arr[i][j];// 현재 값 넣기
					dfs(start + 1);
					back(i, j);// 원상복귀
				}
			}
		}
	}// end of dfs

	static void go(int x, int y) {
		adjacency[x][y]++;// 현재값++
		if (y - 1 >= 0) {// 위 존재
			adjacency[x][y - 1]++;
		}
		if (x - 1 >= 0) {// 왼쪽 존재
			adjacency[x - 1][y]++;
		}
		if (y + 1 < M) {// 아래 존재
			adjacency[x][y + 1]++;
		}
		if (x + 1 < N) {// 오른쪽 존재
			adjacency[x + 1][y]++;
		}
	}

	static void back(int x, int y) {
		adjacency[x][y]--;// 현재값++
		if (y - 1 >= 0) {// 위 존재
			adjacency[x][y - 1]--;
		}
		if (x - 1 >= 0) {// 왼쪽 존재
			adjacency[x - 1][y]--;
		}
		if (y + 1 < M) {// 아래 존재
			adjacency[x][y + 1]--;
		}
		if (x + 1 < N) {// 오른쪽 존재
			adjacency[x + 1][y]--;
		}
	}
}// end of class