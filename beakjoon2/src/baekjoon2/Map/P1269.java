package baekjoon2.Map;

import java.io.*;
import java.util.*;

public class P1269 {
	public static void main(String[] args) throws IOException {
		/*
		 * int A(A의 원소의 개수), B(B의 원소의 개수) 둘째줄 A 리스트 셋째줄 B 리스트
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int A = Integer.valueOf(arr[0]);
		int B = Integer.valueOf(arr[1]);

		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < A; i++) {
			set.add(Integer.valueOf(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < B; i++) {
			set2.add(Integer.valueOf(st.nextToken()));
		}

		int cnt = 0;

		for (int val : set) {
			if (!set2.contains(val)) {
				cnt++;
			}
		}
		for (int val : set2) {
			if (!set.contains(val)) {
				cnt++;
			}
		}

		System.out.println(cnt);

	}// end of main
}
// end of class