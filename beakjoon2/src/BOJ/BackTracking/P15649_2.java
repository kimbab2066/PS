package BOJ.BackTracking;

import java.io.*;
import java.util.*;

public class P15649_2 {
	static boolean[] visit;
	static int arr[];
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		M = Integer.valueOf(str[1]);
		visit = new boolean[N];
		arr = new int[M];

		DFS(0);
		System.out.println(sb);

	}// end of main

	public static void DFS(int depth) {
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
				DFS(depth + 1);
				visit[i] = false;
			}
		}
		return;
	}// end of DFS
}// end of class