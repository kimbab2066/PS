package BOJ.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P1697 {
	static int[] arr = new int[100001];
	static Queue<Integer> q = new LinkedList<>();
	static int N, K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		K = Integer.valueOf(str[1]);
		for (int i = 0; i < 100000; i++) {
			Arrays.fill(arr, -1);
		}
		arr[N] = 0;
		q.add(N);
		bfs();
		System.out.println(arr[K]);
	}// end of main

	static void bfs() {
		while (arr[K] == -1) {
			int val = q.poll();
			for (int nx : new int[] { val - 1, val + 1, val * 2 }) {
				if (nx < 0 || nx > 100000) continue;
				if (arr[nx] != -1) continue;
				arr[nx] = arr[val]+1;
				q.add(nx);
			}
		} // end of while
	}// end of bfs
}// end of class