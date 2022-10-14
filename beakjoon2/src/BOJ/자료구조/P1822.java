package BOJ.자료구조;

import java.util.Arrays;
import java.util.Scanner;

public class P1822 {
	static int result;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int[] arr = new int[A];
		for (int i = 0; i < A; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		result = A;
		for (int i = 0; i < B; i++) {
			int target = in.nextInt();
			binarySearch(0, A - 1, target, arr);
		}
		System.out.println(result);
		for (int val : arr) {
			if (val != 0) {
				System.out.print(val + " ");
			}
		}
	}// end of main

	static void binarySearch(int start, int end, int target, int[] arr) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				arr[mid] = 0;
				result--;
			} else if (arr[mid] <= target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (end + start) / 2;
		}
	}// end of bS
}// end of class