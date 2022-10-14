package BOJ.자료구조;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// n장의 카드 있음 1~n번까지 사용
		// 1장 남을 때까지 반복, 제일 위에 있는 카드 버림 그 다음 제일 위에 있는 카드 제일 아래로
		int n = in.nextInt();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		while (q.size() > 1) {
			q.poll();
			q.offer(q.poll());
		}
		System.out.println(q.poll());
	}// end of main
}// end of class