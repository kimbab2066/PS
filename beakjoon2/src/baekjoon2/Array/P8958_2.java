package baekjoon2.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8958_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		// 테스트 케이스
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int score = 0;
			int idx = 0;
			for (byte val : br.readLine().getBytes()) {
				if (val == 'O') {
					idx++;
					score += idx;
				} else {
					idx = 0;
				}
			} // end of for
			sb.append(score).append("\n");
		} // end of for
		System.out.println(sb);
	}// end of main
}// end of class
