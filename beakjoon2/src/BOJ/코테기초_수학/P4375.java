package BOJ.코테기초_수학;

import java.io.*;
import java.util.*;

public class P4375 {
	public static void main(String[] args) throws IOException {
		/*
		 * 2와 5로 나누어 떨어지지 않는 정수 n(1 ≤ n ≤ 10000)가 주어졌을 때,
		 * 
		 * 1로만 이루어진 n의 배수를 찾는 프로그램을 작성하시오.
		 * 
		 * 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다.
		 * 
		 * 1로 이루어진 n의 배수 중 가장 작은 수의 자리수를 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		StringBuilder sb = new StringBuilder();
		while ((input = br.readLine()) != null) {
			int N = Integer.valueOf(input);
			int num = 0;
			for (int i = 1;; i++) {
				num = num * 10 + 1;
				num %= N;
				if (num == 0) {
					sb.append(i).append("\n");
					break;
				}
			}
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class