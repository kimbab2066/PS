package BOJ.자료구조;

import java.util.LinkedList;
import java.util.Scanner;

public class P1966 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		StringBuilder sb = new StringBuilder();
		while (T-- > 0) {
			int N = in.nextInt();
			int M = in.nextInt();
			LinkedList<int[]> li = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				// 위치, 중요도
				li.offer(new int[] { i, in.nextInt() });
			}
			int cnt = 0;

			while (!li.isEmpty()) {
				int[] front = li.poll();
				boolean isResult = true;
				for (int i = 0; i < li.size(); i++) {
					if (front[1] < li.get(i)[1]) {
						li.offer(front);
						for (int j = 0; j < i; j++) {
							li.offer(li.poll());
						}
						isResult = false;
						break;
					}
				}
				if (!isResult) {
					continue;
				}
				cnt++;
				if (front[0] == M) {
					break;
				}
			}
			sb.append(cnt + "\n");
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class