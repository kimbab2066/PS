package baekjoon2.Undefined;

import java.util.Arrays;
import java.util.Scanner;

public class P2309_2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] arr = new int[9];
		int cpA = 0;
		int cpB = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					cpA = i;
					cpB = j;
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == cpA || i == cpB) continue;
			System.out.println(arr[i]);
		}

	}// end of main
}// end of class
