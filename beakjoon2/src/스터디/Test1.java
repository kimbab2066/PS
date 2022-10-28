package 스터디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//구현 핵심은 비트마스킹연산임
public class Test1 {
	static int N, A, B, cnt;
	static int[] arr, scores;

	public static void main(String[] args) throws IOException {
		input();
		logic();
//		output();
	} // end of main

	static void logic() {
		// 모든 경우의 수 = 2의 N제곱
		for (int i = 0; i < (1 << arr.length); i++) {
			scores = arr.clone();
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				if (((1 << j) & i) != 0) {
					scores[j] = -scores[j];
				}
				sum += scores[j];
			}
			if (A <= sum && sum <= B) cnt++;
		}

		System.out.println(cnt);
	}// end of logic

	static void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		A = Integer.valueOf(st.nextToken());
		B = Integer.valueOf(st.nextToken());
	}// end of input

	static void output() {
		int cnt = 0;
		for (int i = 0; i < (int) Math.pow(2, N); i++) {
			if (A <= scores[i] && scores[i] <= B) {
				cnt++;
			}
		}
//		System.out.println(cnt);
	}// end of output
}// end of class
// 3장이 있을 때 8개의 경우의 수가 나옴
// 모두+, 모두-, n-1개+, n-2+