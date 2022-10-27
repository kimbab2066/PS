package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class P5430 {
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
			while (st.hasMoreTokens()) {
				dq.offer(Integer.valueOf(st.nextToken()));
			}
			oper(p, dq);
		}
		System.out.println(sb);
	}// end of main

	static void oper(String p, ArrayDeque<Integer> dq) {
		boolean direction = true;
		for (int i = 0; i < p.length(); i++) {
			char ch = p.charAt(i);
			if (ch == 'R') {
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
		PrintResult(dq, direction);
	}// end of oper

	static void PrintResult(ArrayDeque<Integer> dq, boolean direction) {
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
	}
}// end of class