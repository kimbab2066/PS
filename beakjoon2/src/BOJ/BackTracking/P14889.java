package BOJ.BackTracking;

import java.io.*;
import java.util.*;

public class P14889 {
	static int N;
	static int S[][];
	static StringTokenizer st;
	static boolean visit[];
	static int MIN = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		/*
		 * N(4 ≤ N ≤ 20, N은 짝수)
		 * 
		 * S의 ij를 구하라.(1 <= S의 ij <= 100)
		 * 
		 * S의 ii = 0
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		S = new int[N][N];
		visit = new boolean[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				S[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		combi(0, 0);
		System.out.println(MIN);

	}// end of main

	static void combi(int idx, int cnt) {

		if (cnt == N / 2) {
			diff();
			return;
		}

		for (int i = idx; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				combi(i + 1, cnt + 1);
				visit[i] = false;
			}
		}
	}// end of combi

	// ability check
	static void diff() {

		int team_start = 0;
		int team_link = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (visit[i] == true && visit[j] == true) {
					team_start += S[i][j];
					team_start += S[j][i];
				} else if (!visit[i] && !visit[j]) {
					team_link += S[i][j];
					team_link += S[j][i];

				}
			}
		}
		int absol = Math.abs(team_start - team_link);
		if (absol == 0) {
			System.out.println(absol);
			System.exit(0);
		}
		MIN = Math.min(absol, MIN);
	}// end of diff
}// end of class

/*
 * S[N][N] for i 1 to N for j 1 to N if S[i][i] = 0 조합의 경우의 수를 찾아라
 */
