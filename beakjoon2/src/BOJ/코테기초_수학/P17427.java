package BOJ.코테기초_수학;

import java.io.*;
import java.util.*;

public class P17427 {

	public static void main(String[] args) throws IOException {
		/*
		 * 두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다.
		 * 
		 * 자연수 A의 약수의 합은 A의 모든 약수를 더한 값이고, f(A)로 표현한다.
		 * 
		 * x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값은 g(x)로 표현한다.
		 * 
		 * 자연수 N이 주어졌을 때, g(N)을 구해보자.
		 * 
		 * 첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
		 * 
		 * 첫째 줄에 g(N)를 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		long result = 0;
		for (int i = 1; i <= N; i++) {
			result += (N / i) * i;
		}
		System.out.println(result);
	}// end of main
}// end of class