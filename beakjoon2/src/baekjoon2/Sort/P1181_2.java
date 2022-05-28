package baekjoon2.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1181_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str[] = new String[N];

		for (int i = 0; i < N; i++) {
			str[i] = br.readLine();
		}

		// logic

		Arrays.sort(str, (s1, s2) -> {
			if (s1.length() == s2.length()) {
				return s1.compareTo(s2);
			} else {
				return s1.length() - s2.length();
			}
		});
		StringBuilder sb = new StringBuilder();
		sb.append(str[0]).append("\n");
		for (int i = 1; i < N; i++) {
			if (!str[i].equals(str[i - 1])) {
				sb.append(str[i]).append("\n");
			}
		}
		System.out.println(sb);
	}// end of main
}// end of class