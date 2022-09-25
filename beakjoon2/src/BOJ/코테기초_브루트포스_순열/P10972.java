package BOJ.코테기초_브루트포스_순열;

import java.io.*;
import java.util.*;

public class P10972 {
	static int N;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 1부터 N까지의 수로 이루어진 순열이 있다. 이때, 사전순으로 다음에 오는 순열을 구하는 프로그램을 작성하시오.
		 * 
		 * 사전 순으로 가장 앞서는 순열은 오름차순으로 이루어진 순열이고, 가장 마지막에 오는 순열은 내림차순으로 이루어진 순열이다.
		 * 
		 * 첫째 줄에 N(1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄에 순열이 주어진다.
		 * 
		 * 첫째 줄에 입력으로 주어진 순열의 다음에 오는 순열을 출력한다. 만약, 사전순으로 마지막에 오는 순열인 경우에는 -1을 출력한다.
		 * 
		 * A[i-1] < A[i] 를 만족하는 가장 큰 i를 찾는다.
		 * 
		 * j >= 1 이면서 A[j] > A[i-1]을 만족하는 가장 큰 j를 찾는다.
		 * 
		 * A[i-1] 과 A[j]를 Swap.
		 * 
		 * A[i] 부터 순열을 뒤집는다.
		 */
		N = Integer.valueOf(br.readLine());
		arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();

		if (nextPermutation()) {
			for (int i = 0; i < N; i++) {
				sb.append(arr[i] + " ");
			}
		} else {
			sb.append("-1");
		}
		System.out.println(sb);
	}// end of main

	// 다음 순열
	static boolean nextPermutation() {
		int i = arr.length - 1;
		while (i > 0 && arr[i - 1] >= arr[i]) i--;
		if (i <= 0) return false;

		int j = arr.length - 1;
		while (arr[j] <= arr[i - 1]) j--;

		swap(i - 1, j);
		j = arr.length - 1;
		while (i < j) {
			swap(i, j);
			i++;
			j--;
		}
		return true;
	}// end of nextPermutation

	static void swap(int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}// end of swap
}// end of class