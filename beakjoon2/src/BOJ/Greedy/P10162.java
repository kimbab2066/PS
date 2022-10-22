package BOJ.Greedy;

import java.util.Scanner;

public class P10162 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int[] arr = { 300, 60, 10 };
		int[] result = new int[3];
		for (int i = 0; i < 3; i++) {
			if (T >= arr[i]) {
				result[i] += T / arr[i];
				T %= arr[i];
			}
		}
		if (T != 0) {
			System.out.println(-1);
			return;
		}
		for (int val : result) {
			System.out.print(val + " ");
		}
	}// end of main
}// end of class