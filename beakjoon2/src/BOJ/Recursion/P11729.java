package BOJ.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11729 {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		sb.append((int) Math.pow(2, N) - 1).append("\n");
		make_top(N, 1, 2, 3);

		System.out.println(sb);
	}// end of main

	/*
	 * N : 원판의 개수 start : 출발지 mid : 이동 장소 to : 목적지
	 */
	static void make_top(int N, int start, int mid, int to) {
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		make_top(N - 1, start, to, mid);
		sb.append(start + " " + to + "\n");
		make_top(N - 1, start, mid, to);

	}// end of make_top
}// end of class