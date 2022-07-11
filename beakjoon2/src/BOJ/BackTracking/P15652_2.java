package BOJ.BackTracking;

import java.io.*;
import java.util.*;

public class P15652_2 {
	static int N, M;
	static int arr[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		arr = new int[M];

		BFS(1, 0);
		System.out.println(sb);
	}// end of main

	static void BFS(int at, int depth) {
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = at; i <= N; i++) {
			arr[depth] = i;
			BFS(i, depth + 1);
		}
	}// end of BFS
}// end of class