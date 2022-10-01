package BOJ.코테기초_브루트포스_순열;

import java.io.*;
import java.util.Arrays;

public class P10819_6 {
	static int N, answer;
	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		visited = new boolean[N];

		dfs(0, 0, 0);
		System.out.println(answer);
	}// end of main

	static void dfs(int cnt, int bf, int sum) {
		if (cnt == N) {
			answer = Math.max(sum, answer);
			return;
		}
		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(cnt + 1, arr[i], cnt == 0 ? 0 : sum + Math.abs(bf - arr[i]));
				visited[i] = false;
			}
		}
	}// end of dfs
}// end of class