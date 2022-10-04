package Programmers.스택과큐.LEVEL2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
	public static void main(String[] args) throws IOException {

	}
}// end of class

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		Queue<Integer> que = new LinkedList<>();
		for (int i = 0; i < progresses.length; i++) {
			que.offer((int) (Math.ceil((100.0 - progresses[i]) / speeds[i]) + 1));
		}
		ArrayList<Integer> list = new ArrayList<>();
		while (!que.isEmpty()) {
			int day = que.poll();
			int cnt = 1;
			while (!que.isEmpty() && day >= que.peek()) {
				cnt++;
				que.poll();
			}
			list.add(cnt);
		}
		answer = list.stream().mapToInt(i -> i).toArray();
		return answer;
	}
}