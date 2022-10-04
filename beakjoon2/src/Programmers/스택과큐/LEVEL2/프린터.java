package Programmers.스택과큐.LEVEL2;

import java.io.*;
import java.util.*;

public class 프린터 {
	public static void main(String[] args) throws IOException {

	}// end of class

	public int solution(int[] priorities, int location) {
		int answer = 1; // 출력 순서를 의미
		// 내림차순 정렬을 이용해서 가장 큰 값에 우선순위 부여
		// 저장 순서와 상관없이 우선순위가 높은 것부터
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int val : priorities) {
			pq.offer(val);
		}

		while (!pq.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				// 기존 배열에서 우선 순위의 값 찾기
				if (priorities[i] == pq.peek()) {
					// 탐색 중인 위치가 i인 경우 return
					if (i == location) {
						return answer;
					}
					// 위치 못찾았으면 answer++한 후 poll
					answer++;
					pq.poll();
				}
			}
		}

		return answer;
	}
}// end of class