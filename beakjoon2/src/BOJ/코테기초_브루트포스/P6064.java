package BOJ.코테기초_브루트포스;

import java.io.*;
import java.util.*;

public class P6064 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 네 개의 정수 M, N, x와 y가 주어질 때,
		 * 
		 * <M:N>이 카잉 달력의 마지막 해라고 하면 <x:y>는 몇 번째 해를 나타내는지 구하는 프로그램을 작성하라.
		 */
		StringBuilder sb = new StringBuilder();
		int T = Integer.valueOf(br.readLine());
		String[] str;
		while (T-- > 0) {
			str = br.readLine().split(" ");
			int M = Integer.valueOf(str[0]);
			int N = Integer.valueOf(str[1]);
			int x = Integer.valueOf(str[2]);
			int y = Integer.valueOf(str[3]);
			// cnt
			int cnt = x;
			// y식
			for (int i = 0; i < N; i++) {
				int fY = x % N == 0 ? N : x % N;
				// y
				if (fY == y) {
					break;
				}
				x = fY + M;// x = 전 y식의 값 + M 
				cnt += M; // cnt = cnt + M
			}
			// exception -1 : cnt
			sb.append(cnt > lcm(M, N) ? "-1" : cnt);
			sb.append("\n");
		}
		System.out.println(sb);
	}// end of main

	static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}// end of class