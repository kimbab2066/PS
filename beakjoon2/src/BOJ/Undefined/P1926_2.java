package BOJ.Undefined;

import java.io.*;
import java.util.*;

/*
 * sample code
 * https://loosie.tistory.com/511
 * https://iseunghan.tistory.com/311
 */
public class P1926_2 {
	static int N, M, cnt, max;
	static int arr[][];
	static boolean visit[][];
	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());

		arr = new int[N][M];
		visit = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.valueOf(st.nextToken());
			}
		} // end of for

		cnt = 0;
		max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (arr[i][j] == 1 && !visit[i][j]) {
					max = Math.max(max, BFS(j, i));
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		System.out.println(max);
	}// end of main

	static int BFS(int x, int y) {

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { x, y });
		visit[y][x] = true;
		int size = 1;
		while (!q.isEmpty()) {
			int[] p = q.poll();
			int px = p[0];
			int py = p[1];

			for (int d = 0; d < 4; d++) {
				int nx = px + dx[d];
				int ny = py + dy[d];
				if (nx < 0 || ny < 0 || nx > M - 1 || ny > N - 1)
					continue;
				if (visit[ny][nx])
					continue;
				if (arr[ny][nx] == 1) {
					size++;
					visit[ny][nx] = true;
					q.add(new int[] { nx, ny });
				}
			}
		}
		return size;
	}// end of BFS
}// end of class