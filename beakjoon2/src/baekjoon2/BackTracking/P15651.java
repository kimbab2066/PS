package baekjoon2.BackTracking;

import java.io.*;
import java.util.*;

public class P15651 {
	static int arr[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int N = Integer.valueOf(str[0]);
		int M = Integer.valueOf(str[1]);
		arr = new int[M];
		DFS(N, M, 0);
		System.out.println(sb);
	}

	static void DFS(int n, int m, int depth) {
		if (depth == m) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			arr[depth] = i;
			DFS(n, m, depth + 1);
		}
		return;
	}
}
