package BOJ.코테기초_브루트포스_순열;

import java.io.*;
import java.util.Arrays;

public class P10819_4 {
	static int N;
	static int answer;
	static boolean[] visited;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 다른 방안 DFS(완전 탐색) 이유 : N이 8까지라 N!해도 경우의 수가 많지 않기 때문에
		// 내부에서 dfs를 다시 부르면서 cnt+1 체크하면 끝
		N = Integer.valueOf(br.readLine());
		arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		visited = new boolean[N];
		dfs(0, 0, 0);
		System.out.println(answer);
	}// end of main

	// bf = Balance Factor
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