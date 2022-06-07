package baekjoon2.Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class P1764 {
	public static void main(String[] args) throws IOException {
		/*
		 * 듣도 못한 사람 수 N 보도 못한 사람 수 M 중복 x 듣보잡 수, 명단 사전 순
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str_arr[] = br.readLine().split(" ");
		int N = Integer.valueOf(str_arr[0]);
		int M = Integer.valueOf(str_arr[1]);

		HashSet<String> set = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if (set.contains(s)) {
				list.add(s);
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for (String val : list) {
			System.out.println(val);
		}

	}// end of main
}// end of class