package baekjoon2.BackTracking;

import java.io.*;
import java.util.*;

public class P15650 {
	static int arr[];
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int M;

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
			DFS(i + 1, depth + 1);
		}
	}// end of DFS
}// end of class
