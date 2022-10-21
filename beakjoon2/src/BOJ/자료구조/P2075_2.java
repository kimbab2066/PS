package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2075_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		StringTokenizer st;
		int[][] arr = new int[n][n];
		int[] level = new int[n];

		Arrays.fill(level, n - 1);

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		int cnt = 0, max = 0;
		while (cnt < n) {
			max = Integer.MIN_VALUE;
			int idx = -1;
			for (int i = 0; i < n; i++) {
				if (max < arr[level[i]][i]) {
					max = arr[level[i]][i];
					idx = i;
				}
			}
			level[idx]--;
			cnt++;
		}
		System.out.println(max);
	}// end of main
}// end of class