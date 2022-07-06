package baekjoon2.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P9375 {
	static HashMap<String, Integer> map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while (T-- > 0) {
			map = new HashMap<>();
			int N = Integer.valueOf(br.readLine());
			while (N-- > 0) {
				st = new StringTokenizer(br.readLine(), " ");
				String name = st.nextToken(), kind = st.nextToken();

				map.put(kind, map.getOrDefault(kind, 0) + 1);
			} // end of while
			int result = 1;
			for (int val : map.values()) {
				result *= val + 1;
			}
			sb.append(result - 1).append("\n");
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class