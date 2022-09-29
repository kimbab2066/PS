package 스터디;

import java.io.*;
import java.util.*;

public class P1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
		 * 
		 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
		 * 
		 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
		 *
		 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
		 * 
		 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
		 * 
		 * if N...1 to 100 then N
		 * 
		 * else 100digit + 1gidit = 2 * 10gidit
		 */
		int N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		if (N < 100)
			sb.append(N);
		else {
			int cnt = 99;
			for (int i = 100; i <= N; i++) {
				int hundred = i / 100;
				int ten = i / 10 % 10;
				int one = i % 10;
				if (hundred + one == 2 * ten) {
					cnt++;
				}
			}
			sb.append(cnt);
		}
		System.out.println(sb);
	}// end of main
}// end of class