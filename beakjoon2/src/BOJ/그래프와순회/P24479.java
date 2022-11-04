package BOJ.그래프와순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P24479 {
	static StringBuilder sb = new StringBuilder();
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static int[] check;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		int R = Integer.valueOf(st.nextToken());

		check = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}
		while (M-- > 0) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.valueOf(st.nextToken());
			int v = Integer.valueOf(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		for (int i = 1; i < graph.size(); i++) {
			Collections.sort(graph.get(i));
		}
		cnt = 1;
		dfs(R);
		for (int i = 1; i < check.length; i++) {
			sb.append(check[i] + "\n");
		}
		System.out.println(sb);
	}// end of main

	static void dfs(int start) {
		check[start] = cnt;
		for (int i = 0; i < graph.get(start).size(); i++) {
			int node = graph.get(start).get(i);
			if (check[node] == 0) {
				cnt++;
				dfs(node);
			}
		}
	}// end of dfs
}// end of class