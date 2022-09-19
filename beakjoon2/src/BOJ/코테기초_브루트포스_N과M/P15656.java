package BOJ.코테기초_브루트포스_N과M;

import java.io.*;
import java.util.*;

public class P15656 {
	static int N, M;
	static int[] arr, result;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 주의 할 점 : 같은 수를 여러 번 골라도 된다.
		String str[] = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		M = Integer.valueOf(str[1]);
		arr = new int[N];
		result = new int[M];

		// value in arr
		str = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(str[i]);
		}
		Arrays.sort(arr);
		bfs(0);

		System.out.println(sb);
	}// end of main

	static void bfs(int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(result[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			result[depth] = arr[i];
			bfs(depth + 1);
		}

	} // end of bfs
}// end of class