package 스터디;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	static int N, A, B;
	static int[] arr, scores;

	public static void main(String[] args) {
		input();
		logic();
		output();
	} // end of main

	static void logic() {
		// 모든 경우의 수 = 2의 N제곱
		int cases = (int) Math.pow(2, N);
		scores = new int[cases];
		boolean bF = true;
		int cnt = N;// plus의 개수
		for (int i = 0; i < cases; i++) {
			for (int j = 0; j < cnt; j++) {
				scores[i] += arr[j];
			}
			cnt--;
		}
		System.out.println(Arrays.toString(scores));
	}// end of logic

	static void input() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		StringBuilder sb = new StringBuilder();
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		A = in.nextInt();
		B = in.nextInt();
	}// end of input

	static void output() {
		int cnt = 0;
		for (int i = 0; i < (int) Math.pow(2, N); i++) {
			if (A <= scores[i] && scores[i] <= B) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}// end of output
}// end of class
// 3장이 있을 때 8개의 경우의 수가 나옴
// 모두+, 모두-, n-1개+, n-2+