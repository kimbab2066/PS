package BOJ.코테기초_브루트포스_비트마스크;

import java.io.*;
import java.util.*;

public class P1182 {
	static int N, K, cnt = 0;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * N개의 정수로 이루어진 수열이 있을 때, 크기가 양수인 부분수열 중에서 그 수열의 원소를 다 더한 값이
		 * 
		 * S가 되는 경우의 수를 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 정수의 개수를 나타내는 N과 정수 S가 주어진다. (1 ≤ N ≤ 20, |S| ≤ 1,000,000)
		 * 
		 * 둘째 줄에 N개의 정수가 빈 칸을 사이에 두고 주어진다. 주어지는 정수의 절댓값은 100,000을 넘지 않는다.
		 * 
		 * 첫째 줄에 합이 S가 되는 부분수열의 개수를 출력한다.
		 */
		String str[] = br.readLine().split(" ");
		N = Integer.valueOf(str[0]);
		K = Integer.valueOf(str[1]);
		arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();

		dfs(0, 0);
		if (K == 0) { // 공집합 제외
			System.out.println(cnt - 1);
		} else {
			System.out.println(cnt);
		}
	}// end of main

	static void dfs(int depth, int sum) {
		if (depth == N) { // 누적시키다 끝까지 탐색했을 때
			if (sum == K) {// 합계값이 목표 K와 같을 때
				cnt++;
			}
			return;
		}
		dfs(depth + 1, sum + arr[depth]);// 현재값 선택
		dfs(depth + 1, sum);// 현재값 선택안함
	}// end of dfs
}// end of class