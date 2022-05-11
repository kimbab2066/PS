package baekjoon2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2675_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			// �ݺ�Ƚ��
			int R = Integer.parseInt(st.nextToken());
			// ���ڿ�
			String S = st.nextToken();
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					sb.append(S.charAt(j));
				}
			} // end of j
			sb.append("\n");
		} // end of i
		System.out.println(sb);
	}// end of main
}// end of class
