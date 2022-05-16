package baekjoon2.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11729_2 {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// pow(2,N) = 2의 n제곱
		sb.append((int) Math.pow(2, N) - 1).append("\n");
		// 초기값 1, 2, 3 (배열 사용하려 했는데 생각해보니 그럴 이유가 없음)
		make_top(N, 1, 2, 3);

		System.out.println(sb);
	}// end of main

	/*
	 * int N : 원판의 개수 
	 * start : 출발 
	 * mid : 이동 장소 (잠깐 사용함) 
	 * to : 도착
	 */
	static void make_top(int N, int start, int mid, int to) {
		// 기저 조건
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		// else 있으나 없으나 차이 x

		/*
		 * A -> C로 옮길 때
		 * A -> B로 N-1개를 이동
		 * A -> C로 가장 밑에 있는 값을 이동
		 * B -> C로 N-1개 이동
		 */

		// A -> B (N-1)
		make_top(N - 1, start, to, mid);
		// A -> C (1개)
		sb.append(start + " " + to + "\n");
		// B -> C (N-1)
		make_top(N - 1, mid, start, to);
	}
}
