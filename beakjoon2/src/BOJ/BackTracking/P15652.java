package BOJ.BackTracking;

import java.io.*;
import java.util.*;

public class P15652 {
	static int M, N;
	static int arr[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		M = Integer.valueOf(str[1]);
		arr = new int[M];
		DFS(1, 0);
		System.out.println(sb);

	}// end of main

	static void DFS(int at, int depth) {
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = at; i <= N; i++) {
			arr[depth] = i;
			DFS(i, depth + 1);
		}
	}// end of BFS
}// end of class