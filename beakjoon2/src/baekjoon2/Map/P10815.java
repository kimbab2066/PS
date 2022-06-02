package baekjoon2.Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());// 카드의 개수

		HashSet<Integer> map = new HashSet<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			map.add(Integer.valueOf(st.nextToken()));
		} // end of for

		int M = Integer.valueOf(br.readLine());// 카드의 정수
		st = new StringTokenizer(br.readLine(), " ");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			int key = Integer.valueOf(st.nextToken());
			if (map.contains(key)) {
				sb.append(1 + " ");
			} else {
				sb.append(0 + " ");
			}
		}
		System.out.println(sb);
	}// end of main
}
