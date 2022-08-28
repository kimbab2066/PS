package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P1699 {
	public static void main(String[] args) throws IOException {
		/*
		 * 주어진 자연수 N을 이렇게 제곱수들의 합으로 표현할 때에 그 항의 최소개수를 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 100,000)
		 * 
		 * 주어진 자연수를 제곱수의 합으로 나타낼 때에 그 제곱수 항의 최소 개수를 출력한다.
		 * 
		 * 일단 제곱수에 대해 알아보자. 제곱수란? 어떤 자연수를 두 번 곱해서 나오는 정수다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());

		int DP[] = new int[N + 1];

		DP[1] = 1;
		for (int i = 2; i <= N; i++) {
			DP[i] = i;
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (j * j == i) {
					DP[i] = 1;
					break;
				}
				DP[i] = Math.min(DP[i], DP[i - j * j] + 1);
			}
		}
		System.out.println(DP[N]);
	}// end of main
}// end of class