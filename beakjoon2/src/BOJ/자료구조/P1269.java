package BOJ.자료구조;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P1269 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// A-B, B-A의 개수를 더해서 출력해라
		int A = in.nextInt();
		int B = in.nextInt();

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < A; i++) {
			set.add(in.nextInt());
		}
		for (int i = 0; i < B; i++) {
			int val = in.nextInt();
			if (set.contains(val)) {
				set.remove(val);
			} else {
				set.add(val);
			}
		}
		System.out.println(set.size());
	}// end of main
}// end of class