package BOJ.코테기초_브루트포스_순열;

import java.io.*;
import java.util.*;

public class P10819 {
	static int N, result;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		Arrays.sort(arr);
		do {
			result = Math.max(result, maxDiffer(arr));
		} while (permutation(arr));
		System.out.println(result);
	}// end of main

	static boolean permutation(int[] arr) {
		int i = arr.length - 1;
		while (i > 0 && arr[i - 1] >= arr[i])
			i--;
		if (i <= 0)
			return false;
		int j = arr.length - 1;
		while (j > 0 && arr[i - 1] >= arr[j])
			j--;
		swap(i - 1, j);
		j = arr.length - 1;
		while (i < j) {
			swap(i, j);
			i++;
			j--;
		}
		return true;
	}// end of permutation

	static void swap(int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	static int maxDiffer(int[] arr) {
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			sum += Math.abs(arr[i - 1] - arr[i]);
		}
		return sum;
	}// end of maxDiffer
}// end of class