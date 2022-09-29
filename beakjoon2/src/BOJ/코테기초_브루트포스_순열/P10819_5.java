package BOJ.코테기초_브루트포스_순열;

import java.io.*;
import java.util.Arrays;

public class P10819_5 {
	static int N;
	static int answer;
	static boolean[] visited;
	static int[] arr, result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 다른 방안 DFS(완전 탐색) 이유 : N이 8까지라 N!해도 경우의 수가 많지 않기 때문에
		// 내부에서 dfs를 다시 부르면서 cnt+1 체크하면 끝
		N = Integer.valueOf(br.readLine());
		arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		visited = new boolean[N];
		result = new int[N];
		dfs(0);
		System.out.println(answer);
	}// end of main

	// bf = Balance Factor
	static void dfs(int cnt) {
		if (cnt == N) {
			answer = Math.max(getResult(), answer);
			return;
		}
		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				result[cnt] = arr[i];
				dfs(cnt + 1);
				visited[i] = false;
			}
		}
	}// end of dfs

	static int getResult() {
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			sum += Math.abs(result[i - 1] - result[i]);
		}
		return sum;
	}
}// end of class