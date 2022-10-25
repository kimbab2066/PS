package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class P11286 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int a = Math.abs(o1);
				int b = Math.abs(o2);
				if (a > b)
					return a - b;
				else if (a == b) {
					if (o1 > o2) return 1;
					else return -1;
				} else return -1;
			}
		});
		while (N-- > 0) {
			int x = Integer.valueOf(br.readLine());
			if (x == 0) {
				if (pq.isEmpty()) {
					sb.append(x);
				} else {
					sb.append(pq.poll());
				}
				sb.append("\n");
			} else {
				pq.offer(x);
			}
		}
		System.out.println(sb);
	}// end of main
}// end of class