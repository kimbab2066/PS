package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class P1822_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		TreeSet<Integer> set = new TreeSet<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			set.add(Integer.valueOf(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < B; i++) {
			int num = Integer.valueOf(st.nextToken());
			if (set.contains(num)) {
				set.remove(num);
			}
		}
		System.out.println(set.size());
		for (int val : set) {
			System.out.print(val + " ");
		}
	}// end of main
}// end of class