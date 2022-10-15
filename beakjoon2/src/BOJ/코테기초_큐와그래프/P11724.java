package BOJ.코테기초_큐와그래프;

import java.util.Scanner;

public class P11724 {
	static int V, E;
	static int[][] graph = new int[1001][1001];

	static boolean[] visited = new boolean[1001];

	static void dfs(int index) {
		if (visited[index]) {
			return;
		}
		visited[index] = true;
		for (int i = 1; i <= V; i++) {
			if (graph[index][i] == 1) {
				dfs(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		V = in.nextInt();
		E = in.nextInt();
		for (int i = 0; i < E; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			graph[a][b] = graph[b][a] = 1;
		}
		int result = 0;
		for (int i = 1; i <= V; i++) {
			if (!visited[i]) {
				dfs(i);
				result++;
			}
		}
		System.out.println(result);
		in.close();

	}// end of main
}// end of class