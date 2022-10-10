package BOJ.코테기초_큐와그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2606 {
	static boolean[] visited;
	static int[][] arr;
	static int n, m, cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 내 생각에 일단 이 문제는 DFS로 풀어야 한다고 봄.
		// 1번과 연결된 노드가 있으면 cnt값을 증가시키면 될 듯?
		n = Integer.valueOf(br.readLine());
		m = Integer.valueOf(br.readLine());
		arr = new int[n + 1][n + 1];
		visited = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			String[] str = br.readLine().split(" ");
			int a = Integer.valueOf(str[0]);
			int b = Integer.valueOf(str[1]);
			arr[a][b] = arr[b][a] = 1;
		}
		// dfs
		dfs(1);
		System.out.println(cnt);
	}// end of main

	static void dfs(int start) {
		visited[start] = true;
		for (int i = 1; i <= n; i++) {
			if (arr[start][i] == 1 && !visited[i]) {
				cnt++;
				dfs(i);
			}
		}
	}
}// end of class