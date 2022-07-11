package BOJ.BackTracking;

import java.io.*;
import java.util.*;

public class P15649 {
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int N = Integer.valueOf(str[0]);
		int M = Integer.valueOf(str[1]);
		
		visit = new boolean[N];
		arr = new int[M];
		DFS(N, M, 0);
		System.out.println(sb);
	}// end of main

	public static void DFS(int N, int M, int depth) {
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				DFS(N, M, depth + 1);
				visit[i] = false;
			}
		}
		return;
	}// end of DFS
}// end of class