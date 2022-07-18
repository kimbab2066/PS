package BOJ.Undefined;

import java.io.*;
import java.util.*;

public class P1926 {
	static int N, M;
	static int arr[][];
	static boolean visit[][];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		arr = new int[N][M];
		visit = new boolean[N][M];
		
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; i < M; j++) {
				arr[i][j] = Integer.valueOf(st.nextToken());
			}
		} // end of for
		
		BFS(0);
		System.out.println(sb);
	}// end of main

	static void BFS(int depth) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (arr[i][j] == 1 && visit[i][j] == false) {
					BFS(depth + 1);
					depth += 1;
					visit[i][j] = true;
				}
			}
		}
		sb.append(depth).append("\n");
	}// end of BFS
}// end of class