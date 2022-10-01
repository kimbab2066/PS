package BOJ.코테기초_브루트포스_순열;

import java.io.*;

public class P10974_2 {
	static int N;
	static int[] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = new int[N];
		visited = new boolean[N];
		permutation(0);
		System.out.println(sb);
	}// end of main

	static void permutation(int depth) {
		if (depth == N) {
			for (int val : arr) {
				sb.append(val + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				arr[depth] = i + 1;
				visited[i] = true;
				permutation(depth + 1);
				visited[i] = false;
			}
		}
	}// end of permutation
}// end of class