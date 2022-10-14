package BOJ.자료구조;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1158 {
	public static void main(String[] args) {
		// 1~N까지 있음, K번째에 poll 나머진 그대로 offer(poll)
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while (q.size() > 1) {
			for (int i = 1; i < k; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll() + ", ");
		}
		sb.append(q.poll() + ">");
		System.out.println(sb);
	}// end of main
}// end of class