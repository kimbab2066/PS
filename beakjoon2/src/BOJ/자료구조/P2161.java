package BOJ.자료구조;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2161 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		StringBuilder sb = new StringBuilder();
		while (n-- > 0) {
			sb.append(q.poll() + " ");
			q.offer(q.poll());
		}

		System.out.println(sb);
	}// end of main
}// end of class