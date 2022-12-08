package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P5014 {
	static int[] dis;
	static Queue<Integer> q = new LinkedList<>();
	static int F, S, G, U, D;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// F, S, G, U, D
		String[] str = br.readLine().split(" ");
		F = Integer.valueOf(str[0]);
		S = Integer.valueOf(str[1]);
		G = Integer.valueOf(str[2]);
		U = Integer.valueOf(str[3]);
		D = Integer.valueOf(str[4]);

		dis = new int[F + 1];
		// 초기값 -1
		Arrays.fill(dis, -1);

		// 시작층
		dis[S] = 0;

		q.add(S);
		bfs();
		if (dis[G] == -1) System.out.println("use the stairs");
		else System.out.println(dis[G]);
	}// main

	static void bfs() {
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int next : new int[] { cur + U, cur - D }) {
				if (next > F || next <= 0 || dis[next] != -1)
					continue;
				dis[next] = dis[cur] + 1;
				q.add(next);
			}
		}
	}// bfs
}// class
