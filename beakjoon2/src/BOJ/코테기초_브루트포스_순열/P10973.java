package BOJ.코테기초_브루트포스_순열;

import java.io.*;
import java.util.*;

public class P10973 {
	static int N;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		if (prevPermutation()) {
			for (int i = 0; i < N; i++) {
				sb.append(arr[i] + " ");
			}
		} else {
			sb.append("-1");
		}
		System.out.println(sb);
	}// end of main

	static boolean prevPermutation() {
		int i = arr.length - 1;
		// arr[i-1] > arr[i]를 만족하는 수 찾기
		while (i > 0 && arr[i - 1] <= arr[i])
			i--;
		// 첫 번째 순열인 경우
		if (i <= 0)
			return false;
		// arr[i-1] > arr[j]를 만족하는 수 찾기
		int j = arr.length - 1;
		while (arr[j] >= arr[i - 1])
			j--;

		swap(i - 1, j);
		j = arr.length - 1;
		while (i < j) {
			swap(i, j);
			i++;
			j--;
		}
		return true;
	}// end

	static void swap(int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}// end of swap
}// end of class