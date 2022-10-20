package BOJ.자료구조;

import java.util.LinkedList;
import java.util.Scanner;

class P20301 {
	public static void main(String[] args) {
		/*
		 * 일반 요세푸스 문제에서 방향만 전환되는 문제이다.
		 * 
		 * 그럼 일단 요세푸스에 대해 알아보자.
		 * 
		 * 요세푸스 문제는 N명의 사람이 있을 때 K번째 사람을 제거해 나가며 순서를 알아내는 문제이다
		 * 
		 * 그럼 M명이 제거될 때마다 방향을 뒤집는다고 하면 앞에서부터 돌렸다면 뒤에서부터로 바꾸면 된다
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int m = in.nextInt();
		LinkedList<Integer> li = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			li.offerLast(i);
		}
		StringBuilder sb = new StringBuilder();
		int total = 0;
		int cnt = 0;
		while (!li.isEmpty()) {
			// if 조건에 방향을 바꾸는 방법을 알아야 함
			// LinkedList는 맞는데 n값이 큰 경우로 갈수록 정답이 아님
			if (total % 2 == 0) {
				for (int i = 1; i < k; i++) {
					li.offer(li.poll());
				}
				sb.append(li.poll() + "\n");
				cnt++;
			} else {
				for (int j = 1; j < k; j++) {
					li.offerFirst(li.pollLast());
				}
				sb.append(li.pollLast() + "\n");
				cnt++;
			}
			if (cnt % m == 0) {
				total++;
			}
		}
		System.out.println(sb);
	}// end of main
}// end of class