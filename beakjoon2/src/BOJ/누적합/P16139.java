package BOJ.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P16139 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		int len = str.length();
		int Q = Integer.valueOf(br.readLine());

		int[][] check = new int[len][26];
		check[0][str.charAt(0) - 'a']++;
		// 누적합
		for (int i = 1; i < str.length(); i++) {
			for (int j = 0; j < 26; j++) {
				check[i][j] = check[i - 1][j];
			}
			check[i][str.charAt(i) - 'a']++;
		}

		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			int cnt = 0;
			// alpha, l to r
			char alpha = st.nextToken().charAt(0);
			int l = Integer.valueOf(st.nextToken());
			int r = Integer.valueOf(st.nextToken());
			if (l == 0) {
				sb.append(check[r][alpha - 'a']);
			} else {
				sb.append(check[r][alpha - 'a'] - check[l - 1][alpha - 'a']);
			}
			sb.append("\n");
		} // end of Q
		System.out.println(sb);
	}// end of main
}// end of class