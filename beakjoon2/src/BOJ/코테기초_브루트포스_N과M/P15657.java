package BOJ.코테기초_브루트포스_N과M;

import java.io.*;
import java.util.*;

public class P15657 {
	static int N, M;
	static int[] arr, result;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		M = Integer.valueOf(str[1]);
		arr = new int[N];
		result = new int[M];
		str = br.readLine().split(" ");
		// value in arr
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(str[i]);
		}
		Arrays.sort(arr);
		bfs(0, 0);
		System.out.println(sb);
	}// end of main

	static void bfs(int at, int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(result[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = at; i < N; i++) {
			result[depth] = arr[i];
			bfs(i, depth + 1);
		}
	}// end of bfs
}// end of class