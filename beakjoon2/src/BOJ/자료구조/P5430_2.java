package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class P5430_2 {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayDeque<Integer> dq;
		int T = Integer.valueOf(br.readLine());

		while (T-- > 0) {
			dq = new ArrayDeque<>();
			String p = br.readLine();
			int n = Integer.valueOf(br.readLine());
			st = new StringTokenizer(br.readLine(), "[],");
			for (int i = 0; i < n; i++) {
				dq.offer(Integer.valueOf(st.nextToken()));
			}
			oper(dq, p);
		} // end of while
		System.out.println(sb);
	}// end of main

	static void oper(ArrayDeque<Integer> dq, String p) {
		boolean direction = true;
		for (int i = 0; i < p.length(); i++) {
			char oper = p.charAt(i);
			if (oper == 'R') {
				direction = !direction;
				continue;
			}
			if (direction) {
				if (dq.pollFirst() == null) {
					sb.append("error\n");
					return;
				}
			} else {
				if (dq.pollLast() == null) {
					sb.append("error\n");
					return;
				}
			}
		}
		printResult(dq, direction);
	}// end of oper

	static void printResult(ArrayDeque<Integer> dq, boolean direction) {
		sb.append("[");
		if (dq.size() > 0) {
			if (direction) {
				sb.append(dq.pollFirst());
				while (!dq.isEmpty()) {
					sb.append("," + dq.pollFirst());
				}
			} else {
				sb.append(dq.pollLast());
				while (!dq.isEmpty()) {
					sb.append("," + dq.pollLast());
				}
			}
		}
		sb.append("]\n");
	}// end of printResult
}// end of class