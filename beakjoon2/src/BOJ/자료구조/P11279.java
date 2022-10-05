package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class P11279 {
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다.
		 * 
		 * 만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고
		 * 
		 * x가 0이라면 배열에서 가장 큰 값을 출력하고 그 값을 배열에서 제거하는 경우이다.
		 */
		n = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		while (n-- > 0) {
			int num = Integer.valueOf(br.readLine());
			if (num != 0) {
				pq.add(num);
			} else {
				if (pq.isEmpty()) {
					sb.append(0 + "\n");
				} else {
					sb.append(pq.poll() + "\n");
				}
			}
		}
		System.out.println(sb);
	}// end of main
}// end of class