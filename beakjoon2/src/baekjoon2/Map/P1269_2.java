package baekjoon2.Map;

import java.io.*;
import java.util.*;

public class P1269_2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int A = Integer.valueOf(arr[0]);
		int B = Integer.valueOf(arr[1]);

		HashSet<Integer> set = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < A; i++) {
			set.add(Integer.valueOf(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < B; i++) {
			int val = Integer.valueOf(st.nextToken());
			if (set.contains(val)) {
				set.remove(val);
			} else {
				set.add(val);
			}
		}
		System.out.println(set.size());
	}// end of main
}// end of class
