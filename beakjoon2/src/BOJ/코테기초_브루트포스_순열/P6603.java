package BOJ.코테기초_브루트포스_순열;

import java.io.*;
import java.util.*;

public class P6603 {
	static int K;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		StringTokenizer st;
		while (true) {
			st = new StringTokenizer(br.readLine());
			K = Integer.valueOf(st.nextToken());
			if (K == 0)
				break;
			int[] arr = new int[K];
			visited = new boolean[K];
			for (int i = 0; i < K; i++) {
				arr[i] = Integer.valueOf(st.nextToken());
			}
			dfs(arr, 0, 0);
			sb.append("\n");
		} // end of while
		System.out.println(sb);
	}// end of main

	static void dfs(int[] arr, int start, int depth) {
		if (depth == 6) {
			for (int i = 0; i < K; i++) {
				if (visited[i]) {
					sb.append(arr[i] + " ");
				}
			}
			sb.append("\n");
		}
		for (int i = start; i < K; i++) {
			visited[i] = true;
			dfs(arr, i + 1, depth + 1);
			visited[i] = false;
		}
	}// end of dfs
}// end of class