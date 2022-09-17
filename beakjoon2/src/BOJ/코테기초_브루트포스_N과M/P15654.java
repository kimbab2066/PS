package BOJ.코테기초_브루트포스_N과M;

import java.io.*;
import java.util.*;

public class P15654 {
	static int N, M;
	static int arr[], result[];
	static StringBuilder sb = new StringBuilder();
	static boolean visit[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());

		arr = new int[N];
		result = new int[M];
		visit = new boolean[N];
		// value in arr
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(arr);
		bfs(0);
		System.out.println(sb);
	}// end of main

	static void bfs(int at) {
		if (at == M) {
			for (int i = 0; i < M; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				result[at] = arr[i];
				bfs(at + 1);
				visit[i] = false;
			}
		}
	}// end of bfs
}// end of class